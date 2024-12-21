package com.example.baseexpandablelistadapterapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ExpandableAdapter extends BaseExpandableListAdapter {

    Context context;
    ArrayList<ParentModel> parentModelArrayList = new ArrayList<>();

    public ExpandableAdapter(Context context, ArrayList<ParentModel> parentModelArrayList){
        this.context = context;
        this.parentModelArrayList = parentModelArrayList;
    }

    public int getGroupCount(){
        return this.parentModelArrayList.size();
    }

    public int getChildrenCount(int grpPosition){
        ArrayList<ChildModel> dataList = parentModelArrayList.get(grpPosition).getChildModels();
        return dataList.size();
    }

    public Object getGroup(int grpPosition){
        return parentModelArrayList.get(grpPosition);
    }

    public Object getChild(int grpPosition, int childPosition){
        ArrayList<ChildModel> dataList = parentModelArrayList.get(grpPosition).getChildModels();
        return dataList.get(childPosition);
    }

    public long getGroupId(int grpPosition){
        return grpPosition;
    }

    public long getChildId(int grpPosition, int childPosition){
        return childPosition;
    }

    public View getGroupView(int grpPosition, boolean isExpandable, View convertView, ViewGroup parent){
        ParentModel parentModel = (ParentModel) getGroup(grpPosition);
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_layout, null);
        TextView roman_parent = convertView.findViewById(R.id.parent_txt_roman);
        TextView text_parent = convertView.findViewById(R.id.parent_txt);

        roman_parent.setText(parentModel.getParent_roman());
        text_parent.setText(parentModel.getParent_text());

        return convertView;
    }

    public View getChildView(int grpPosition, int childPosition, boolean isChildList, View convertView, ViewGroup parent){
        ChildModel childModel = (ChildModel) getChild(grpPosition, childPosition);
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_layout, null);
        TextView child_roman = convertView.findViewById(R.id.child_txt_roman);
        TextView child_text = convertView.findViewById(R.id.child_txt);

        child_roman.setText(childModel.getChild_roman());
        child_text.setText(childModel.getChild_text());

        return convertView;
    }

    public boolean hasStableIds(){
        return false;
    }

    public boolean isChildSelectable(int grpPosition, int childPosition){
        return true;
    }
}
