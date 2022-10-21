package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input size:");
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();

        var array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input element " + (i + 1) + ":");
            array[i] = console.nextInt();
        }

        System.out.println(getMinAmountOfElements(array) + " - element to remove");
    }

    public static int getMinAmountOfElements(int[] Arr) {
        int maxIncArrLength = 0;
        int currentIncArrLength;
        boolean isArrInc;

        for (int i = 0; i < Arr.length; i++) {
            isArrInc = true;
            currentIncArrLength = 1;
            for (int j = i + 1; (j < Arr.length) && isArrInc; j++) {
                if (Arr[j - 1] < Arr[j]) {
                    currentIncArrLength++;
                } else {
                    isArrInc = false;
                }
            }
            maxIncArrLength = Math.max(maxIncArrLength, currentIncArrLength);
        }
        return Arr.length - maxIncArrLength;
    }
}
