package task4;

import task4.logic.Calculations;
import task4.data.Arr;

public class Main {
    public static void main(String[] args) {
        Arr arr1 = new Arr(5);
        Calculations.CheckArrForPrime(arr1);
        Arr arr2  = new Arr(2);
        Calculations.CheckArrForPrime(arr2);
    }
}
