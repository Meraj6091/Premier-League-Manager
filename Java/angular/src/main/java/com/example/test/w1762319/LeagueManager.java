package com.example.test.w1762319;

import java.io.IOException;
import java.util.List;

public interface LeagueManager {
    void Add();

    List<FootballClub> football();

    void Delete();
    void Statistics();
    void PremierLeagueTable();
    void AddAPlayedMatch();
    void SaveIntoAFile() throws IOException;
    void displayMenu() throws IOException, ClassNotFoundException;
    void Load() throws IOException, ClassNotFoundException;
    public static final int numOfFootballClubs=20;

    List<Match> match();

    List<FootballClub> Wins();

    List<FootballClub> Goals();

    Object create(FootballClub football);

    Object match(Match match);

    Object random(Match match);

    Object search(Match match);

    List<Match> get();
}
