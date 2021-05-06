package com.example.myapplication;

public class Versions15 {

    private String  version15;
    private int  description15;
    private boolean expandable15;


    public Versions15(String version15, int description15) {
        this.version15 = version15;
        this.description15 = description15;
        this.expandable15 = false;
    }



    public boolean isExpandable() {
        return expandable15;
    }

    public void setExpandable(boolean expandable) {
        this.expandable15 = expandable;
    }


    public String getVersion() {
        return version15;
    }

    public void setVersion(String version15) {
        this.version15 = version15;
    }


    public int getDescription(){
        return description15;
    }

    public void setDescription(int description15) {
        this.description15 = description15;
    }

    @Override
    public String toString(){
        return "Versions15{" +
                "version='" + version15 + '\'' +
                ", description='" + description15 + '\'' +
                '}';

    }
}