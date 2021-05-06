package com.example.myapplication;

public class Versions7 {

    private String  version7;
    private int  description7;
    private boolean expandable7;


    public Versions7(String version7, int description7) {
        this.version7 = version7;
        this.description7 = description7;
        this.expandable7 = false;
    }



    public boolean isExpandable() {
        return expandable7;
    }

    public void setExpandable(boolean expandable) {
        this.expandable7 = expandable;
    }


    public String getVersion() {
        return version7;
    }

    public void setVersion(String version7) {
        this.version7 = version7;
    }


    public int getDescription(){
        return description7;
    }

    public void setDescription(int description7) {
        this.description7 = description7;
    }

    @Override
    public String toString(){
        return "Versions7{" +
                "version='" + version7 + '\'' +
                ", description='" + description7 + '\'' +
                '}';

    }
}