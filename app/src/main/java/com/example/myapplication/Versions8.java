package com.example.myapplication;

public class Versions8 {

    private String  version8;
    private int  description8;
    private boolean expandable8;


    public Versions8(String version8, int description8) {
        this.version8 = version8;
        this.description8 = description8;
        this.expandable8 = false;
    }



    public boolean isExpandable() {
        return expandable8;
    }

    public void setExpandable(boolean expandable) {
        this.expandable8 = expandable;
    }


    public String getVersion() {
        return version8;
    }

    public void setVersion(String version8) {
        this.version8 = version8;
    }


    public int getDescription(){
        return description8;
    }

    public void setDescription(int description8) {
        this.description8 = description8;
    }

    @Override
    public String toString(){
        return "Versions8{" +
                "version='" + version8 + '\'' +
                ", description='" + description8 + '\'' +
                '}';

    }
}