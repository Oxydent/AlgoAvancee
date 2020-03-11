public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj){
        if (obj==this){return true;}
        if (!(obj instanceof Point)){return false;}
        Point p= (Point) obj;
        return ((x == p.x) && (y == p.y));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
