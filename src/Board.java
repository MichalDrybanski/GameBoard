public class Board {
    public  class Point{
        private int x;
        private int y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        public int getX() {return x;}
        public int getY() {return y;}
    }
    private Point X;
    private Point A;
    private Point B;

    public Board(int xX, int xY, int aX, int aY, int bX, int bY){
        X = new Point(xX, xY);
        A = new Point(aX, aY);
        B = new Point(bX, bY);
    }
}
