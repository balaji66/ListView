package com.durga.balaji66.listview;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.durga.balaji66.listview.Adapters.CustomListAdapter;
import com.durga.balaji66.listview.ModelClass.StudentModelClass;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Global Variables
    private ListView mListView;
    private List<StudentModelClass> studentList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This is for adding custom Action bar title.
        ActionBar actionBar =getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("LIST VIEW");
        initializeViews();
        addItemsToList();
        // Creating Custom list adapter object of parameterized constructor.
        CustomListAdapter listAdapter = new CustomListAdapter(MainActivity.this,studentList);
        //Setting listAdapter to listView.
        mListView.setAdapter(listAdapter);
    }
    //Initializing Views
    public void initializeViews() {
        mListView =findViewById(R.id.listView);
    }

    //Adding items to list.
    public void addItemsToList()
    {
        studentList.add(0, new StudentModelClass("balaji","8886259252","123"));
        studentList.add(1, new StudentModelClass("seshu","9912310102","123"));
        studentList.add(2, new StudentModelClass("gopi","9014850011","123"));
        studentList.add(3, new StudentModelClass("prashanth","5555555555","123"));
        studentList.add(4, new StudentModelClass("amit","2222222222","123"));
        studentList.add(5, new StudentModelClass("suresh","1111111111","123"));

    }




}
