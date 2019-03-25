package com.example.nflteams.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nflteams.R;
import com.example.nflteams.adapter.MyAdapter;

import java.util.List;

public class FreeAgents {

    private MyAdapter myAdapter;
    List<Team> myDataset;
    MyAdapter.OnItemClickListener listener;


    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // create a new view
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.activity_detailsteam, parent, false);

        // set the view's size, margins, paddings and layout parameters
        MyAdapter.ViewHolder vh = new MyAdapter.ViewHolder(v);
        return vh;
    }

    public void onCreateViewHolder(final MyAdapter.ViewHolder holder, final int position){
        myAdapter = new MyAdapter(myDataset,listener);
        final Team team = myDataset.get(position);
        final String[] keyPlayers = team.getKeyPlayers();
                holder.txtHeader.setText(keyPlayers[0]);
                holder.txtFooter.setText(keyPlayers[1]);
    }

}
