package com.example.myapplication;

public class Versions9 {

    private String  version9;
    private int  description9;
    private boolean expandable9;


    public Versions9(String version9, int description9) {
        this.version9 = version9;
        this.description9 = description9;
        this.expandable9 = false;
    }



    public boolean isExpandable() {
        return expandable9;
    }

    public void setExpandable(boolean expandable) {
        this.expandable9 = expandable;
    }


    public String getVersion() {
        return version9;
    }

    public void setVersion(String version9) {
        this.version9 = version9;
    }


    public int getDescription(){
        return description9;
    }

    public void setDescription(int description9) {
        this.description9 = description9;
    }

    @Override
    public String toString(){
        return "Versions9{" +
                "version='" + version9 + '\'' +
                ", description='" + description9 + '\'' +
                '}';

    }
}