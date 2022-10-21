package task4.logic;

import task4.data.Arr;

public class Calculations {
    public static void CheckArrForPrime(Arr arr){
        for (int i = 0; i < arr.LENGTH; i++) {
            if(isPrime(arr.ARRAY[i])) System.out.print(i+" ");
        }
    }
    private static boolean isPrime(int num){

        int temp;
        boolean isPrime=true;
        for (int i=2; i<=num/2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
