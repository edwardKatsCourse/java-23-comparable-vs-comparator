package com.telran.comparator;

import java.util.Arrays;
import java.util.Date;

public class ComparatorAppl {
    public static void main(String[] args) {
        User user1 = new User("Daniel", 43, 4.5);
        User user2 = new User("Natalie", 29, 3.8);
        User user3 = new User("Andrew", 39, 4.1);
        User user4 = new User("Jimmy", 21, 3.3);
        User user5 = new User("Sarah", 50, 5.0);
        User user6 = new User("Andrew", 51, 4.9);
        User user7 = new User("Sarah", 51, 5.0);
        User user8 = new User("Andrew", 51, 3.1);
        User [] users = new User[] {
                user2, user1,
                user5, user4,
                user3, user7,
                user6, user8
        };

        printUsers(users);

        Arrays.sort(users, new UserComparator());
        System.out.println(" --- After sorting --- ");
        printUsers(users);

    }

    private static void printUsers(User [] users) {
        for (User user : users) {
            System.out.println(user.toString());
        }
    }

    private static void dateToStringFormat() {
        Date date = new Date();
        System.out.println(String.format("%td-%tm-%tY %tT", date, date, date, date));
        System.out.println(String.format("%td %tB %tY %tT", date, date, date, date));
        System.out.println(String.format("%td %tb %tY %tT", date, date, date, date));
        System.out.println(String.format("%tD %tT", date, date));
    }
}


