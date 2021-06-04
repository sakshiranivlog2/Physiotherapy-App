package com.example.myapplication;

public class Versions19 {

    private String  version19;
    private int  description19;
    private boolean expandable19;


    public Versions19(String version19, int description19) {
        this.version19 = version19;
        this.description19 = description19;
        this.expandable19 = false;
    }



    public boolean isExpandable() {
        return expandable19;
    }

    public void setExpandable(boolean expandable) {
        this.expandable19 = expandable;
    }


    public String getVersion() {
        return version19;
    }

    public void setVersion(String version) {
        this.version19 = version;
    }


    public int getDescription(){
        return description19;
    }

    public void setDescription(int description) {
        this.description19 = description;
    }

    @Override
    public String toString(){
        return "Versions19{" +
                "version='" + version19 + '\'' +
                ", description='" + description19 + '\'' +
                '}';

    }
}