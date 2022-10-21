package task2.logic;

import task2.data.Area;
import task2.data.Point;

public final class Calculations {
    public static boolean CheckPointPosition (Point point){

        return CheckPointPosition(point.X, point.Y);
    }
    public static boolean CheckPointPosition (int x, int y){
        for (int i = 0; i < Area.getAmountOfShapes(); i++) {

            if((Area.getRect(i).X<=x)
                    && (Area.getRect(i).X+Area.getRect(i).B>=x)
                        && (Area.getRect(i).Y>=y)
                            && (Area.getRect(i).Y-Area.getRect(i).A<=y)) return true;

        }

        return false;
    }
}
