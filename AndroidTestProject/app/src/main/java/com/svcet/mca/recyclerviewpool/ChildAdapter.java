package com.svcet.mca.recyclerviewpool;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.MyChildViewHolder> {
    private List<SubList> sublist;
    int createcount=0;
    int bindcount=0;
    int holdercount=0;
    public ChildAdapter(List<SubList> sublist){
        this.sublist=sublist;

    }
    @NonNull
    @Override
    public MyChildViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       Log.i("onCreateView : " ,""+createcount++);
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_layout,parent,false);
        return new MyChildViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyChildViewHolder holder, int position) {
       Log.i("onBindcound :",""+bindcount++);
        SubList sub=sublist.get(position);
        holder.subtitle.setText(sub.getSub_title());
        holder.desc.setText(sub.getDesc());


    }

    @Override
    public int getItemCount() {
        return sublist.size();
    }

    public class MyChildViewHolder extends RecyclerView.ViewHolder {
        TextView subtitle;
        TextView desc;
        public MyChildViewHolder(@NonNull View itemView) {
            super(itemView);
            subtitle=itemView.findViewById(R.id.sub_title);
            desc=itemView.findViewById(R.id.description);
            Log.i("viewHolder :",""+holdercount++);
        }
    }
}
