package org.example;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int games = 3;
        int rounds = 5;
        System.out.println("Number of games: " + rounds);

        int totalScore = 0;
        GameSettings gamesSettings = new GameSettings() {
        };
        gamesSettings.printGameSettings();

        for(int i = 0; i < games; i++){
            Board board = new Board();
            Point gamePoints = new Point();
            System.out.println("*".repeat(5) + " Gra nr " + (i+1)
                    + " " + "*".repeat(5));


            for(int j = 1; j <= rounds; j++) {
                boolean validInput = false;

                while(!validInput) {

                    System.out.println("Runda " + (j));
                    System.out.println("Podaj wspolrzedne punktu A");

                    try {
                        int aX = scanner.nextInt();
                        int aY = scanner.nextInt();
                        board.setPointA(board.new Point(aX, aY));

                        System.out.println("Podaj wspolrzedne punktu B");
                        int bX = scanner.nextInt();
                        int bY = scanner.nextInt();
                        board.setPointB(board.new Point(bX, bY));

                        validInput = true;
                    } catch (IllegalArgumentException e) {
                        System.out.println("Twoje wspolrzedne wykraczaja poza zakres tablicy. Wprowadz poprawne wspolrzedne.");
                    }
                }

                int score = scoreCalculator(board.getPointA(), board.getPointB(), board.getPointX(), (j - 1));
                gamePoints.addScore(score);

                int distanceA = distancePoints(board.getPointX(), board.getPointA());
                int distanceB = distancePoints(board.getPointX(), board.getPointB());
                if (distanceA == 0 || distanceB == 0) {
                    System.out.println("Trafiłeś punkt X!");
                    break;
                }else {
                    if(distanceA < distanceB){
                        System.out.println("Blizej jest punkt A " + board.getPointA().getX() + " " + board.getPointA().getY());
                        System.out.println("Brak trafienia. Najbliższy punkt do X znajduje się w odległości " + distanceA);
                    }else{
                        System.out.println("Blizej jest punkt B " + board.getPointB().getX() + " " + board.getPointB().getY());
                        System.out.println("Brak trafienia. Najbliższy punkt do X znajduje się w odległości " + distanceB);
                    }
                }
            }
            totalScore += gamePoints.getScore();
            System.out.println("Wynik gry " + i + ": " + gamePoints.getScore() + " punktów w " + gamePoints.getNum_rounds() + " rundach.");
        }
        System.out.println("Wynik ogólny: " + totalScore + " punktów w " + rounds + " grach.");
    }

    private static int scoreCalculator(Board.Point pointA, Board.Point pointB,
                                       Board.Point pointX, int round){
        int distancePointA = distancePoints(pointX, pointA);
        int distancePointB = distancePoints(pointX, pointB);
        int minDistance = Math.min(distancePointA, distancePointB);

        if(minDistance == 0){
            return GameSettings.scores[round];
        }else if(minDistance <= 10){
            int adScore = 10 - minDistance;
            return adScore;
        }else{
            return 0;
        }
    }

    private static int distancePoints(Board.Point pointA, Board.Point pointB){
        int aX = pointA.getX() - pointB.getX();
        int aY = pointA.getY() - pointB.getY();
        return (int) Math.sqrt(aX * aX + aY * aY);
    }

}