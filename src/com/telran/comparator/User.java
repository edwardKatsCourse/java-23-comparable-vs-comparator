package com.telran.comparator;

public class User {

    private String name;
    private Integer age;
    private Double score;

    public User(String name, Integer age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {

        return String.format("Name: %s | age: %s | score: %s", name, age, score);
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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
