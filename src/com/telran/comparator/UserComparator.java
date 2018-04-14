package com.telran.comparator;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        int nameCompareResult = o1.getName().compareTo(o2.getName());
        if (nameCompareResult == 0) {
            int ageCompareResult = o1.getAge().compareTo(o2.getAge());
            if (ageCompareResult == 0) {
                int scoreCompareResult = o1.getScore().compareTo(o2.getScore());
                return scoreCompareResult;
            } else {
                return ageCompareResult;
            }
        } else {
            return nameCompareResult;
        }
    }
}
