package lab;

import java.util.ArrayList;

public class Figure {
    private static ArrayList<Figure> figures = new ArrayList<Figure>();
    
    public Figure(){
        figures.add(this);
    }
    
    public void draw(){
        System.out.println("Figure show");
    }
    
    public static void drawScene(){
        for(Figure f : Figure.figures){
            f.draw();
        }
    }
}
