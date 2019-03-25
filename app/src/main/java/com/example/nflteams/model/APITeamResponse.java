package com.example.nflteams.model;

import java.util.List;

public class APITeamResponse {


    private List<Team> results;

    public List<Team> getResults() {
        return results;
    }

    public void setResults(List<Team> results) {
        this.results = results;
    }

}
