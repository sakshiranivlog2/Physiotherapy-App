package com.example.myapplication;

public class Versions18 {

    private String  version18;
    private int  codeName18, description18;
    private boolean expandable18;


    public Versions18(int codeName18, String version18, int description18) {
        this.codeName18 = codeName18;
        this.version18 = version18;
        this.description18 = description18;
        this.expandable18 = false;
    }



    public boolean isExpandable() {
        return expandable18;
    }

    public void setExpandable(boolean expandable) {
        this.expandable18 = expandable;
    }

    public int getCodeName(){
        return codeName18;
    }

    public void setCodeName(int codeName18) {
        this.codeName18 = codeName18;
    }


    public String getVersion() {
        return version18;
    }

    public void setVersion(String version18) {
        this.version18 = version18;
    }


    public int getDescription(){
        return description18;
    }

    public void setDescription(int description18) {
        this.description18 = description18;
    }

    @Override
    public String toString(){
        return "Versions18{" +
                "codeName='" + codeName18 + '\'' +
                ", version='" + version18 + '\'' +
                ", description='" + description18 + '\'' +
                '}';

    }
}