package task6.logic;

import task4.data.Arr;

public class Matrix {

    public static void createMatrix(Arr arr){
        for (int i = 0; i < arr.LENGTH ; i++) {
            for (int j = 0; j < arr.LENGTH; j++) {
                System.out.print(arr.ARRAY[(i+j)% arr.LENGTH]+" ");
            }
            System.out.println("");

        }


    }



}
