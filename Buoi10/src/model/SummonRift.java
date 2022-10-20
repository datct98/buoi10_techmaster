package model;

import java.util.ArrayList;

public class SummonRift {
    private String time;
    private ArrayList<Team> teams;

    public void setTime(String time) {
        this.time = time;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public SummonRift(String time, ArrayList<Team> teams) {
        this.time = time;
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "time='" + time + '\'' +
                ", teams=" + teams +
                '}';
    }
}
