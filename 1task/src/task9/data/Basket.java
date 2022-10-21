package task9.data;

import java.util.ArrayList;

public  class Basket {
    private  ArrayList<Ball> bskt = new ArrayList<>();

    public  void addBall(Ball ball){
        bskt.add(ball);
    }

    public  Ball getBall(int i){
        return bskt.get(i);
    }
    public  int ballsAmount(){
        return bskt.size();
    }

}
