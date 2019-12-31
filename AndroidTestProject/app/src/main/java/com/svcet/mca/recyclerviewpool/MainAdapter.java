package com.svcet.mca.recyclerviewpool;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyMainViewHolder> {

    RecyclerView.RecycledViewPool viewpool=new RecyclerView.RecycledViewPool();

    private int viewcount=0;
    private int bindcount=0;
    private int myviewholder=0;
    private List<MainList> mainList;
    private  Context context;
    public MainAdapter(List<MainList> mainList, Context context){
        this.context=context;
        this.mainList=mainList;
    }
    @NonNull
    @Override
    public MyMainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.second_layout,parent,false);
       Log.i("Main create view :", ""+ viewcount++);
        return new MyMainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyMainViewHolder holder, int position) {
        MainList main=mainList.get(position);
        holder.maintitle.setText(main.getTitle());
      // Log.i("Main onbind method :",""+ bindcount++);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(holder.child_rv.getContext(),LinearLayoutManager.VERTICAL,false);
        layoutManager.setItemPrefetchEnabled(true);


        ChildAdapter adapter=new ChildAdapter(main.getSubList());
        holder.child_rv.setLayoutManager(layoutManager);
        holder.child_rv.setAdapter(adapter);
        holder.child_rv.setRecycledViewPool(viewpool);
        adapter.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mainList.size();
    }

    public class MyMainViewHolder extends RecyclerView.ViewHolder {
        TextView maintitle;
        RecyclerView child_rv;
        public MyMainViewHolder(@NonNull View itemView) {
            super(itemView);
            maintitle=itemView.findViewById(R.id.title);
            child_rv=itemView.findViewById(R.id.second_rv);
           // Log.i("MyMiainViewholder :",""+ myviewholder++);
        }
    }
}
