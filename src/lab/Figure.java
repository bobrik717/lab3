package lab;

import java.util.ArrayList;

public abstract class Figure {
    private static ArrayList<Figure> figures = new ArrayList<Figure>();
    
    public Figure(){
        figures.add(this);
    }
    
    public abstract void draw();
    
    public static void drawScene(){
        for(Figure f : Figure.figures){
            f.draw();
        }
    }
}
