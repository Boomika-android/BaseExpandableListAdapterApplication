package com.example.baseexpandablelistadapterapplication;

public class ChildModel {
    private String child_roman;
    private String child_text;

    public ChildModel(String child_roman, String child_text){
        this.child_roman = child_roman;
        this.child_text = child_text;
    }

    public String getChild_roman(){
        return child_roman;
    }

    public String getChild_text(){
        return child_text;
    }
}