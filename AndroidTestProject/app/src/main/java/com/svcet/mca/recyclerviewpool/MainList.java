package com.svcet.mca.recyclerviewpool;

import java.util.List;

public class MainList {
    private String title;
    private List<SubList> subList;

    public MainList(String title, List<SubList> subList) {
        this.title = title;
        this.subList = subList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubList> getSubList() {
        return subList;
    }

    public void setSubList(List<SubList> subList) {
        this.subList = subList;
    }
}
