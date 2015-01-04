package lab;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;

public class Circle extends Figure {

    private Dot center;
    private int radius;
    {
        this.radius = 1;
    }

    public Circle() {
        this.center = new Dot();
    }

    public Circle(int x, int y, int r) {
        this();
        this.setX(x);
        this.setY(y);
        this.setRadius(r);
    }

    public Circle(Circle c) {
        this(c.getX(), c.getY(), c.getRadius());
    }

    public Circle(Dot center, int r) {
        this(center.x, center.y, r);
    }

    public int getX() {
        return this.center.x;
    }

    public void setX(int x) {
        this.center.x = x;
    }

    public int getY() {
        return this.center.y;
    }

    public void setY(int y) {
        this.center.y = y;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int r) {
        if (r > 0) {
            this.radius = r;
        }
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return String.format("Circle ("+this.getX()+","+this.getY()+") radius: "+this.getRadius());
    }
}
