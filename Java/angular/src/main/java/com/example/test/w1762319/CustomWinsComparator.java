package com.example.test.w1762319;

import java.util.Comparator;

public class CustomWinsComparator implements Comparator<FootballClub> {

    @Override
    public int compare(FootballClub o1, FootballClub o2) {
        if (o1.getWins() == o2.getWins())
            return 0;
        else if (o1.getWins() > o2.getWins())
            return -1;

        else
            return 1;

    }

}
