package com.example.myapplication.Adapter;

public class Versionsaddd {

    private String  version9;
    private int codeName2, description2;
    private boolean expandable2;


    public Versionsaddd(int codeName2, String version9, int description2) {
        this.codeName2 = codeName2;
        this.version9 = version9;
        this.description2 = description2;
        this.expandable2 = false;
    }



    boolean isExpandable() {
        return expandable2;
    }

    void setExpandable(boolean expandable) {
        this.expandable2 = expandable;
    }

    int getCodeName(){
        return codeName2;
    }

    public void setCodeName(int codeName) {
        this.codeName2 = codeName;
    }

    public String getVersion() {
        return version9;
    }

    public void setVersion(String version) {
        this.version9 = version;
    }


    int getDescription(){
        return description2;
    }

    public void setDescription(int description) {
        this.description2 = description;
    }

    @Override
    public String toString(){
        return "Versions{" +
                "codeName='" + codeName2 + '\'' +
                ", version='" + version9 + '\'' +
                ", description='" + description2+ '\'' +
                '}';

    }
}