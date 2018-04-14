package com.telran.comparable;

import java.util.Arrays;

public class ComparableAppl {

    public static void main(String[] args) {

        //Comparable vs Comparator

        String a = "a";
        String b = "b";
        String c = "c";

        String[] letters = new String[3];

        letters[0] = c;
        letters[1] = a;
        letters[2] = b;

        System.out.println(Arrays.toString(letters));
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));

        System.out.println("--------");
        Integer[] digits = new Integer[]{10, 2, 3, 1, -1, -91, 91, 100};
        System.out.println(Arrays.toString(digits));
        Arrays.sort(digits);
        System.out.println(Arrays.toString(digits));

        System.out.println(" ------- ");

        User david = new User("David", 49, 1.0);

        User jane1 = new User("Jane", 26, -1.0);
        User jane2 = new User("Jane", 27, 3.9);
        User jane3 = new User("Jane", 26, 3.9);

        User simon = new User("Simon", 33, 4.7);
        User bob1 = new User("Bob", 33, 4.2);
        User bob2 = new User("Bob", 31, 2.2);
        User bob3 = new User("Bob", 18, 3.5);
        User bob4 = new User("Bob", 18, 3.6);

        User[] users = new User[]{simon, jane1, david, bob1, bob2, bob3, bob4, jane2, jane3};
        for (User user : users) {
            System.out.print(user.getName());
            System.out.print(", " + user.getAge());
            System.out.println();
        }

        Arrays.sort(users);

        System.out.println("-- After sorting --");
        for (User user : users) {
            System.out.print(user.getName());
            System.out.print(", " + user.getAge());
            System.out.print(", " + user.getScore());
            System.out.println();
        }
    }
}


class User implements Comparable<User> {
    private String name;
    private Integer age;
    private Double score;

    //-1 - otherObject is bigger
    //0 - both objects are equal
    //1 - this object is bigger than otherObject

    /**
     * This method sorts by:
     *
     * name (alphabetical sort)
     * age (eldest first)
     * score (highest first)
     */
//    @Override
//    public int compareTo(com.telran.comparable.User otherObject) {
//
//        if (this.name.compareTo(otherObject.getName()) == 0) {
//
//            if (this.age.compareTo(otherObject.getAge()) == 0) {
//
//                return -this.score.compareTo(otherObject.getScore());
//            } else {
//
//                return -this.age.compareTo(otherObject.getAge());
//            }
//        } else {
//
//            return this.name.compareTo(otherObject.getName());
//        }
//    }


    /**
     * This method sorts by:
     *
     * score (highest first)
     * name (alphabetical sort)
     * age (eldest first)
     */
    @Override
    public int compareTo(User o) {
        if (this.score.compareTo(o.getScore()) == 0) {
            if (this.name.compareTo(o.getName()) == 0) {

                return -this.age.compareTo(o.getAge());
            } else {

                return this.name.compareTo(o.getName());
            }
        } else {

            return -this.score.compareTo(o.getScore());
        }
    }




    public User(String name, Integer age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "com.telran.comparable.User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}