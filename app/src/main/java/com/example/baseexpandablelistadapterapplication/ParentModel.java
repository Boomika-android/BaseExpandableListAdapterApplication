package com.example.baseexpandablelistadapterapplication;

import java.util.ArrayList;

public class ParentModel {
    private String parent_roman;
    private String parent_text;
    private ArrayList<ChildModel> childModels;

    public ParentModel(String parent_roman, String parent_text, ArrayList<ChildModel> childModels){
        this.parent_roman = parent_roman;
        this.parent_text = parent_text;
        this.childModels = childModels;
    }

    public ParentModel(String parent_roman, String parent_text) {
        this.parent_roman = parent_roman;
        this.parent_text = parent_text;
        this.childModels = new ArrayList<>();
    }

    public String getParent_roman(){
        return parent_roman;
    }

    public String getParent_text(){
        return parent_text;
    }

    public ArrayList<ChildModel> getChildModels(){
        return childModels;
    }

    public void addChild(ChildModel childModel){
        childModels.add(childModel);
    }
}
