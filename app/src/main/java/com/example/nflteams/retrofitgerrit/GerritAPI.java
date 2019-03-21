package com.example.nflteams.retrofitgerrit;


import com.example.nflteams.model.APITeamResponse;
import com.example.nflteams.model.Team;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GerritAPI {

    @GET("teams.json")
    Call<List<Team>> getNFLTeam();

}
