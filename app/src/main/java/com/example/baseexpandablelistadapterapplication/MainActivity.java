package com.example.baseexpandablelistadapterapplication;

import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MainActivity extends AppCompatActivity {

    ExpandableAdapter adapter;
    ExpandableListView expandableListView;
    ArrayList<ParentModel> child_list = new ArrayList<ParentModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        expandableListView = findViewById(R.id.expandable_listView);
        ParentModel parentModel1 = new ParentModel("1.", "Introduction of Android Operating System");
        parentModel1.addChild(new ChildModel("i", "History and Features of Android"));
        parentModel1.addChild(new ChildModel("ii", "Versions and Releases of Android"));
        parentModel1.addChild(new ChildModel("iii", "Android's Architecture"));
        child_list.add(parentModel1);

        ParentModel parentModel2 = new ParentModel("2.", "Introduction of Android Studio IDE");
        parentModel2.addChild(new ChildModel("i", "History and Features of Android Studio"));
        parentModel2.addChild(new ChildModel("ii", "Versions and Releases of Android Studio"));
        parentModel2.addChild(new ChildModel("iii", "Key Components of Android Studio"));
        parentModel2.addChild(new ChildModel("iv", "Android SDK and Emulator"));
        parentModel2.addChild(new ChildModel("v", "Introduction to Gradle"));
        child_list.add(parentModel2);

        ParentModel parentModel3 = new ParentModel("3.", "How to create a Project?");
        child_list.add(parentModel3);

        ParentModel parentModel4 = new ParentModel("4.", "Layouts and UI Designs");
        parentModel4.addChild(new ChildModel("i", "Types of Layouts"));
        parentModel4.addChild(new ChildModel("ii", "Different XML Files"));
        parentModel4.addChild(new ChildModel("iii", "Basics of UI Design"));
        parentModel4.addChild(new ChildModel("iv", "UI components"));
        child_list.add(parentModel4);

        ParentModel parentModel5 = new ParentModel("5.", "UI Widgets and Material Designs");
        parentModel5.addChild(new ChildModel("i", "ListView and Spinner"));
        parentModel5.addChild(new ChildModel("ii", "RecyclerView"));
        parentModel5.addChild(new ChildModel("iii", "SnackBars and CardViews"));
        parentModel5.addChild(new ChildModel("iv", "ViewPager and ViewPager2"));
        parentModel5.addChild(new ChildModel("v", "SearchView and Scrollview"));
        parentModel5.addChild(new ChildModel("vi", "GridView and DatePicker, TimePicker"));
        parentModel5.addChild(new ChildModel("vii", "ViewSwitcher and ViewFlipper"));
        parentModel5.addChild(new ChildModel("viii", "Progress Dialog and Alert Dialog"));
        parentModel5.addChild(new ChildModel("ix", "ExpandableListView and Nested RecyclerView"));
        parentModel5.addChild(new ChildModel("x", "Intents, Toast, Activity and Fragment"));
        child_list.add(parentModel5);

        ParentModel parentModel6 = new ParentModel("6.", "SQLite Database");
        parentModel6.addChild(new ChildModel("i", "Introduction of SQLite"));
        parentModel6.addChild(new ChildModel("ii", "Create, Insert, Update, Delete and View the data"));

        adapter = new ExpandableAdapter(this, child_list);
        expandableListView.setAdapter(adapter);
    }
}