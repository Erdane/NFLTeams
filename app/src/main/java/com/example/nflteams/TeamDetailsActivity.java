package com.example.nflteams;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.nflteams.adapter.MyAdapter;
import com.example.nflteams.model.Team;

public class TeamDetailsActivity extends Activity {
    private MainController mainController;
    private RecyclerView recyclerView;
    private MyAdapter mAdapter;
    private LinearLayoutManager layoutManager;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailsteam);
        recyclerView = findViewById(R.id.recycler_details);
        Team team = new Team();
        showListKeyPlayers(team.getKeyPlayers());

    }

    public void showListKeyPlayers(String[] input) {

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new MyAdapter(input);

        recyclerView.setAdapter(mAdapter);
    }
}
