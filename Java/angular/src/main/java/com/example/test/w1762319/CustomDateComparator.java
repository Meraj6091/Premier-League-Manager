package com.example.test.w1762319;

import java.util.Comparator;

public class CustomDateComparator implements Comparator<Match> {

    @Override
    public int compare(Match other1, Match other2) {
        if (other1.getYear() < other2.getYear()) {
            return 1;
        } else if (other1.getYear() > other2.getYear()) {
            return -1;
        } else if (other1.getYear() == other2.getYear()) {
            if (other1.getMonth() < other2.getMonth()) {
                return 1;
            } else if (other1.getMonth() > other2.getMonth()) {
                return -1;
            } else if (other1.getMonth() == other2.getMonth()) {
                if (other1.getDay() < other2.getDay()) {
                    return 1;
                } else if (other1.getDay() > other2.getDay()) {
                    return -1;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }


    }
}