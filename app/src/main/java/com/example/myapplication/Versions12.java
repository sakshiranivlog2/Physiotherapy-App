package com.example.myapplication;

public class Versions12 {

    private String  version12;
    private int  description12;
    private boolean expandable12;


    public Versions12(String version12, int description12) {
        this.version12 = version12;
        this.description12 = description12;
        this.expandable12 = false;
    }



    public boolean isExpandable() {
        return expandable12;
    }

    public void setExpandable(boolean expandable) {
        this.expandable12 = expandable;
    }


    public String getVersion() {
        return version12;
    }

    public void setVersion(String version9) {
        this.version12 = version12;
    }


    public int getDescription(){
        return description12;
    }

    public void setDescription(int description12) {
        this.description12 = description12;
    }

    @Override
    public String toString(){
        return "Versions12{" +
                "version='" + version12 + '\'' +
                ", description='" + description12 + '\'' +
                '}';

    }
}