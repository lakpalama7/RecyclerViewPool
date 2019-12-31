package com.svcet.mca.recyclerviewpool;

public class SubList {
    private String sub_title;
    private String desc;

    public SubList(String sub_title, String desc) {
        this.sub_title = sub_title;
        this.desc = desc;
    }

    public String getSub_title() {
        return sub_title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
