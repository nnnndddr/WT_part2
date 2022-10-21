package task2.data;

import java.util.ArrayList;

public class Area {
    private static ArrayList<Rectangle> Shapes=new ArrayList<Rectangle>() ;

    public static void addRect(Rectangle rect){
    Shapes.add(rect);
    }

    public static Rectangle getRect(int i){
        return Shapes.get(i);
    }

    public static int getAmountOfShapes(){
        return Shapes.size();
    }

}
