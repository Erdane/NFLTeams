package com.example.nflteams;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.widget.RecyclerView;

public class TeamDetailsActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailsteam);
        //recyclerView = findViewById(R.id.recycler_details);
        //recyclerView.setHasFixedSize(true);

       Intent intent = new Intent(this, TeamDetailsActivity.class );
        startActivity(intent);


    }
}
