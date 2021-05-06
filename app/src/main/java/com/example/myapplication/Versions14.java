package com.example.myapplication;

public class Versions14 {

    private String  version14;
    private int  description14;
    private boolean expandable14;


    public Versions14(String version14, int description14) {
        this.version14 = version14;
        this.description14 = description14;
        this.expandable14 = false;
    }



    public boolean isExpandable() {
        return expandable14;
    }

    public void setExpandable(boolean expandable) {
        this.expandable14 = expandable;
    }


    public String getVersion() {
        return version14;
    }

    public void setVersion(String version14) {
        this.version14 = version14;
    }


    public int getDescription(){
        return description14;
    }

    public void setDescription(int description14) {
        this.description14 = description14;
    }

    @Override
    public String toString(){
        return "Versions14{" +
                "version='" + version14 + '\'' +
                ", description='" + description14 + '\'' +
                '}';

    }
}