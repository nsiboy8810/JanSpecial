package com.example.android.janspecial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CourseAdapter courseAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] people = {"f","g","g","f","g","g","f","g","g","f","g","g","f","g","g","f","g","g"};

        recyclerView = (RecyclerView) findViewById(R.id.rv_available_courses);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.hasFixedSize();
        courseAdapter = new CourseAdapter();
        courseAdapter.setmCourses(people);
        recyclerView.setAdapter(courseAdapter);


    }
}
