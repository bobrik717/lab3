package lab;

public class Dot extends Figure {

    int x, y;

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Dot(Dot dot) {
        this(dot.x, dot.y);
    }

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Dot() {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Dot:("+this.x+","+this.y+")";
    }
}
