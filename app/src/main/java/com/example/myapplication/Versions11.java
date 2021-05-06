package com.example.myapplication;

public class Versions11 {

    private String  version11;
    private int  description11;
    private boolean expandable11;


    public Versions11(String version11, int description11) {
        this.version11 = version11;
        this.description11 = description11;
        this.expandable11 = false;
    }



    public boolean isExpandable() {
        return expandable11;
    }

    public void setExpandable(boolean expandable) {
        this.expandable11 = expandable;
    }


    public String getVersion() {
        return version11;
    }

    public void setVersion(String version) {
        this.version11 = version;
    }


    public int getDescription(){
        return description11;
    }

    public void setDescription(int description) {
        this.description11 = description;
    }

    @Override
    public String toString(){
        return "Versions11{" +
                "version='" + version11 + '\'' +
                ", description='" + description11 + '\'' +
                '}';

    }
}