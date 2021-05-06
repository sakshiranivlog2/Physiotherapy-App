package com.example.myapplication;

public class Versions17 {

    private String  version17;
    private int  codeName17, description17;
    private boolean expandable17;


    public Versions17(int codeName17,String version17, int description17) {
        this.codeName17 = codeName17;
        this.version17 = version17;
        this.description17 = description17;
        this.expandable17 = false;
    }



    public boolean isExpandable() {
        return expandable17;
    }

    public void setExpandable(boolean expandable) {
        this.expandable17 = expandable;
    }

    public int getCodeName(){
        return codeName17;
    }

    public void setCodeName(int codeName17) {
        this.codeName17 = codeName17;
    }


    public String getVersion() {
        return version17;
    }

    public void setVersion(String version17) {
        this.version17 = version17;
    }


    public int getDescription(){
        return description17;
    }

    public void setDescription(int description17) {
        this.description17 = description17;
    }

    @Override
    public String toString(){
        return "Versions17{" +
                "codeName='" + codeName17 + '\'' +
                ", version='" + version17 + '\'' +
                ", description='" + description17 + '\'' +
                '}';

    }
}