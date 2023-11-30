package org.example;

import java.util.Random;

public class Board{
    private int x = 8;
    private int y = 8;
    private Point pointX;
    private Point pointA;
    private Point pointB;


    public Board() {
        Random random = new Random();
        this.pointX = new Point(random.nextInt(x),random.nextInt(y));
        this.pointA = null;
        this.pointB = null;
    }

    public void setPointA(Point pointA) throws IllegalArgumentException {
        if(pointA.getX() < 1 || pointA.getX() > x || pointA.getY() < 1 || pointA.getY() > y){
            throw new IllegalArgumentException("Wykraczasz poza zakres planszy");
        }
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) throws IllegalArgumentException{
        if(pointB.getX() < 1 || pointB.getX() > x || pointB.getY() < 1 || pointB.getY() > y){
            throw new IllegalArgumentException("Wykraczasz poza zakres planszy");
        }
        this.pointB = pointB;
    }

    public Point getPointX() {
        return pointX;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }


    public class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
