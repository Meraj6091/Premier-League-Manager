package com.example.test.w1762319;

import java.io.Serializable;

public class Match implements Serializable {
    private String teamA;
    private String teamB;
    private int teamAScored;
    private int teamBScored;
    private int day;
    private int month;
    private int year;
    private String date;

    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public int getTeamAScored() {
        return teamAScored;
    }

    public void setTeamAScored(int teamAScored) {
        this.teamAScored = teamAScored;
    }

    public int getTeamBScored() {
        return teamBScored;
    }

    public void setTeamBScored(int teamBScored) {
        this.teamBScored = teamBScored;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
