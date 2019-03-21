package com.example.nflteams;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.nflteams.adapter.MyAdapter;
import com.example.nflteams.model.Team;

import java.util.List;

public class MainActivity extends Activity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    //private final Context context = null;

    private MainController controller;

   // public MainActivity(Context context) {
     //   this.context = context;
    //}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.my_recycler_view);



        controller = new MainController(this);
        controller.onStart();
    }

    public void showList(List<Team> input) {

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new MyAdapter(input);
        recyclerView.setAdapter(mAdapter);
    }

}