package com.example.myapplication;

public class Versions20 {

    private String  version20;
    private int  description20;
    private boolean expandable20;


    public Versions20(String version20, int description20) {
        this.version20 = version20;
        this.description20 = description20;
        this.expandable20 = false;
    }



    public boolean isExpandable() {
        return expandable20;
    }

    public void setExpandable(boolean expandable) {
        this.expandable20 = expandable;
    }


    public String getVersion() {
        return version20;
    }

    public void setVersion(String version9) {
        this.version20 = version20;
    }


    public int getDescription(){
        return description20;
    }

    public void setDescription(int description20) {
        this.description20 = description20;
    }

    @Override
    public String toString(){
        return "Versions20{" +
                "version='" + version20 + '\'' +
                ", description='" + description20 + '\'' +
                '}';

    }
}