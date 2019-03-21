package com.example.nflteams;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

class BackTotop extends Activity {
    private ImageButton button;
    private RecyclerView recyclerView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        button = findViewById(R.id.BackToTop);
        recyclerView = findViewById((R.id.my_recycler_view));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToTop();
            }
        });
    }

    private void backToTop(){
        recyclerView.scrollTo(0, recyclerView.getTop());
    }

}
