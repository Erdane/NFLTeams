package com.example.nflteams;

import android.util.Log;

import com.example.nflteams.model.Team;
import com.example.nflteams.retrofitgerrit.GerritAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainController implements Callback<List<Team>>{


    private MainActivity activity;

    public MainController(MainActivity activity) {
        this.activity = activity;
    }

    public void onStart(){

        //Pour ceux qui veulent aller plus loin
        //Singleton
        //Pour ceux qui veulent aller encore plus loin
        // Injection de dépendances
        //https://erdane.github.io/
        //https://pokeapi.co/api/v2/

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://erdane.github.io/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        GerritAPI gerritAPI = retrofit.create(GerritAPI.class);

        //Call<APITeamResponse> call = gerritAPI.getNFLTeam();
        //call.enqueue(new Callback<APITeamResponse>() {
        Call<List<Team>> call = gerritAPI.getNFLTeam();
        call.enqueue((Callback<List<Team>>) this);



    }


    @Override
    public void onResponse(Call<List<Team>> call, Response<List<Team>> response) {
        List<Team> listTeam = response.body();
        activity.showList(listTeam);
    }

    @Override
    public void onFailure(Call<List<Team>> call, Throwable t) {
        Log.d("Error", "API Error");

    }
}
