package com.example.test.w1762319;

import java.util.Comparator;

public class CustomScoreComparator implements Comparator<FootballClub> {
    @Override
    public int compare(FootballClub o1, FootballClub o2) {
        if (o1.getScoredGoalsCount() == o2.getScoredGoalsCount())
            return 0;
        else if (o1.getScoredGoalsCount() > o2.getScoredGoalsCount())
            return -1;

        else
            return 1;

    }
}
