package com.svcet.mca.recyclerviewpool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private List<MainList> mainlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.first_rv);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mainlist=new ArrayList<>();

        mainlist.add(new MainList("Animal ",getSubListAnimal()));
        mainlist.add(new MainList("Country",getSubListCountry()));
        mainlist.add(new MainList("City",getSubListCity()));
        mainlist.add(new MainList("Number",getSubListNumber()));
        mainlist.add(new MainList("Name",getSubListName()));
        mainlist.add(new MainList("Food",getSubListFood()));
        mainlist.add(new MainList("Devices",getSubListDevices()));
        mainlist.add(new MainList("House",getSubListHouse()));
        mainlist.add(new MainList("Pen",getSubListPen()));

        recyclerView.setAdapter(new MainAdapter(mainlist,this));






    }

    private List<SubList> getSubListPen() {
        List<SubList> sublist=new ArrayList<>();
        sublist.add(new SubList("Pen Title","This is the first title"));
        sublist.add(new SubList("pen Title","This is the Second title"));
        sublist.add(new SubList("pen Title","This is the Third title"));
        sublist.add(new SubList("pen Title","This is the fourth title"));
        sublist.add(new SubList("pen Title","This is the fifth title"));
        return sublist;
    }

    private List<SubList> getSubListHouse() {
        List<SubList> sublist=new ArrayList<>();
        sublist.add(new SubList("Hourse Title","This is the first title"));
        sublist.add(new SubList("Hourse Title","This is the Second title"));
        sublist.add(new SubList("House Title","This is the Third title"));
        sublist.add(new SubList("House Title","This is the fourth title"));
        sublist.add(new SubList("House Title","This is the fifth title"));
        return sublist;
    }

    private List<SubList> getSubListDevices() {
        List<SubList> sublist=new ArrayList<>();
        sublist.add(new SubList("Device Title","This is the first title"));
        sublist.add(new SubList("Device Title","This is the Second title"));
        sublist.add(new SubList("Device Title","This is the Third title"));
        sublist.add(new SubList("Device Title","This is the fourth title"));
        sublist.add(new SubList("Device Title","This is the fifth title"));
        return sublist;
    }

    private List<SubList> getSubListFood() {
        List<SubList> sublist=new ArrayList<>();
        sublist.add(new SubList("Food Title","This is the first title"));
        sublist.add(new SubList("Food Title","This is the Second title"));
        sublist.add(new SubList("Food Title","This is the Third title"));
        sublist.add(new SubList("Food Title","This is the fourth title"));
        sublist.add(new SubList("Food Title","This is the fifth title"));
        return sublist;
    }

    private List<SubList> getSubListName() {
        List<SubList> sublist=new ArrayList<>();
        sublist.add(new SubList("Name Title","This is the first title"));
        sublist.add(new SubList("Name Title","This is the Second title"));
        sublist.add(new SubList("Name Title","This is the Third title"));
        sublist.add(new SubList("Name Title","This is the fourth title"));
        sublist.add(new SubList("Name Title","This is the fifth title"));
        return sublist;
    }

    private List<SubList> getSubListNumber() {
        List<SubList> sublist=new ArrayList<>();
        sublist.add(new SubList("Bangalore Title","This is the first title"));
        sublist.add(new SubList("Chittoor Title","This is the Second title"));
        sublist.add(new SubList("Chenai Title","This is the Third title"));
        sublist.add(new SubList("Hyderbad Title","This is the fourth title"));
        sublist.add(new SubList("Delhi Title","This is the fifth title"));
        return sublist;
    }

    private List<SubList> getSubListCity() {
        List<SubList> sublist=new ArrayList<>();
        sublist.add(new SubList("Bangalore Title","This is the first title"));
        sublist.add(new SubList("Chittoor Title","This is the Second title"));
        sublist.add(new SubList("Chenai Title","This is the Third title"));
        sublist.add(new SubList("Hyderbad Title","This is the fourth title"));
        sublist.add(new SubList("Delhi Title","This is the fifth title"));
        return sublist;


    }


    private List<SubList> getSubListAnimal() {
        List<SubList> sublist=new ArrayList<>();

        sublist.add(new SubList("Tiger Title","This is the first title"));
        sublist.add(new SubList("Lion Title","This is the Second title"));
        sublist.add(new SubList("Bear Title","This is the Third title"));
        sublist.add(new SubList("Dog Title","This is the fourth title"));
        sublist.add(new SubList("Cat Title","This is the fifth title"));
        return sublist;

    }
    private List<SubList> getSubListCountry() {
        List<SubList> sublist=new ArrayList<>();

        sublist.add(new SubList("Usa Title","This is the first title"));
        sublist.add(new SubList("Uae Title","This is the Second title"));
        sublist.add(new SubList("China Title","This is the Third title"));
        sublist.add(new SubList("Japan Title","This is the fourth title"));
        sublist.add(new SubList("Korea Title","This is the fifth title"));
        return sublist;

    }
}
