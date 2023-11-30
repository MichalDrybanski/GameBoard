package org.example;

public class Point {
    private int score;
    private int num_rounds;

    public Point(){
        score = 0;
        num_rounds = 0;
    }

    public int getScore() {
        return score;
    }

    public int getNum_rounds() {
        return num_rounds;
    }
    public void addScore(int roundScore){
        score += roundScore;
        num_rounds++;
    }
}
