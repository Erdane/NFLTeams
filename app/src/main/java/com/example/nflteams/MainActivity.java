package com.example.nflteams;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.nflteams.adapter.MyAdapter;
import com.example.nflteams.model.Team;

import java.util.List;

public class MainActivity extends Activity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    //private MyAdapter.OnItemClickListener listener;


    private MainController controller;


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

        //MyAdapter.ViewHolder holder = null;
        /*holder.txtHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSecondActivity();
            }
        });*/
        MyAdapter.OnItemClickListener listener = new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Team team) {
                startSecondActivity();
            }
        };
        mAdapter = new MyAdapter(input, listener);

        recyclerView.setAdapter(mAdapter);
    }

    //DOESNT WORK§§§§§§§§§§§§§§§§§§§§§§§
    public void backToTop(View view) {
        view.scrollTo(0,recyclerView.getTop());
    }

    public void startSecondActivity(){
        Intent intent = new Intent(this, TeamDetailsActivity.class);
        startActivity(intent);
    }




}