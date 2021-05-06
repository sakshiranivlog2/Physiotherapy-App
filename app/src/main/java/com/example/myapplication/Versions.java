package com.example.myapplication;

public class Versions {

    private String  version, apiLevel;
    private int codeName, description;

    private boolean expandable;


    public Versions(int codeName, String version, String apiLevel, int description) {
        this.codeName = codeName;
        this.version = version;
        this.apiLevel = apiLevel;
        this.description = description;
        this.expandable = false;
    }



    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    public int getCodeName(){
        return codeName;
    }

    public void setCodeName(int codeName) {
        this.codeName = codeName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApiLevel(){
        return apiLevel;
    }

    public void setApiLevel(String apiLevel) {
        this.apiLevel = apiLevel;
    }

    public int getDescription(){
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return "Versions{" +
                "codeName='" + codeName + '\'' +
                ", version='" + version + '\'' +
                ", apiLevel='" + apiLevel + '\'' +
                ", description='" + description + '\'' +
                '}';

    }
}