package com.example.test.w1762319;

import java.util.Comparator;

public class FootballClub  extends SportsClub implements Comparator<FootballClub> {
    private int scoredGoalsCount;
    private int receivedGoalsCount;
    private int currentlyPoints;
    private int matchesPlayed;
    private int wins;
    private int draws;
    private int defeats;

//    public FootballClub(int scoredGoalsCount, int receivedGoalsCount, int currentlyPoints, int matchesPlayed, int wins, int draws, int defeats) {
//        this.scoredGoalsCount = scoredGoalsCount;
//        this.receivedGoalsCount = receivedGoalsCount;
//        this.currentlyPoints = currentlyPoints;
//        this.matchesPlayed = matchesPlayed;
//        this.wins = wins;
//        this.draws = draws;
//        this.defeats = defeats;
//    }

    public int getScoredGoalsCount() {
        return scoredGoalsCount;
    }

    public void setScoredGoalsCount(int scoredGoalsCount) {
        this.scoredGoalsCount = scoredGoalsCount;
    }

    public int getReceivedGoalsCount() {
        return receivedGoalsCount;
    }

    public void setReceivedGoalsCount(int receivedGoalsCount) {
        this.receivedGoalsCount = receivedGoalsCount;
    }

    public int getCurrentlyPoints() {
        return currentlyPoints;
    }

    public void setCurrentlyPoints(int currentlyPoints) {
        this.currentlyPoints = currentlyPoints;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }



    @Override
    public int compare(FootballClub o1, FootballClub o2) {
        if (o1.currentlyPoints == o2.getCurrentlyPoints())
            return 0;
        else if (o1.currentlyPoints > o2.getCurrentlyPoints())
            return -1;
        else {
            int GoalDifA = o1.getScoredGoalsCount() - o1.getReceivedGoalsCount();
            int GoalDifB = o2.getScoredGoalsCount() - o2.getReceivedGoalsCount();
            if(GoalDifA<GoalDifB){
                return 1;
            }
            else if(GoalDifA>GoalDifB){
                return -1;
            }
            else
                return 0;
        }

    }

}
