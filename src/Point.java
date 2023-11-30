public class Point {
    private int score;
    private int num_rounds;

    public Point(int score, int num_rounds) {
        this.score = score;
        this.num_rounds = num_rounds;
    }

    public int getScore() {
        return score;
    }

    public int getNumRounds() {
        return num_rounds;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setNumRounds(int num_rounds) {
        this.num_rounds = num_rounds;
    }

    @Override
    public String toString() {
        return "Wynik: " + score + " w " + num_rounds + " rundach";
    }

    public static void main(String[] args) {
        Point[] games = new Point[5];

        games[0] = new Point(100, 1);
        games[1] = new Point(70, 2);
        games[2] = new Point(40, 3);
        games[3] = new Point(20, 4);
        games[4] = new Point(10, 5);

        for (Point game : games) {
            System.out.println(game);
        }
    }
}
