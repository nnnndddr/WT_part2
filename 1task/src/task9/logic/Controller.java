package task9.logic;

import task9.data.Basket;
import task9.data.Colour;

import java.sql.SQLOutput;

public class Controller {

    public static void checkBsktWeight(Basket bskt){

        if(bskt.ballsAmount()>0){
            double sum=0;
            for (int i = 0; i < bskt.ballsAmount(); i++) {
                sum += bskt.getBall(i).WEIGHT;
            }
            System.out.println("Ball weight :"+sum);

        } else {
            System.out.println("Basket is empty");
        }


    }
    public static void countBalls(Basket bskt, Colour colour){
        if(bskt.ballsAmount()>0){
            int sum=0;
            for (int i = 0; i < bskt.ballsAmount(); i++) {
               if(colour.equals(bskt.getBall(i).COLOUR)) sum++;
            }
            System.out.println("Balls with this color in the basket :"+sum);

        } else {
            System.out.println("Basket is empty");
        }



    }

}
