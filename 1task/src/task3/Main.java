package task3;

import java.util.Scanner;
import task3.Calculator.TanCalculator;
import task3.Iterator.ThirdIterator;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input a:");
        double a = console.nextDouble();
        System.out.println("Input b:");
        double b = console.nextDouble();
        System.out.println("Input h:");
        double h = console.nextDouble();

        outputTable(a, b, h);

    }



    private static void outputTable(double a, double b, double h){
        var range = new ThirdIterator(a, b, h);
        var calculator = new TanCalculator();
        for (var number:range){
            System.out.println(number + " | " + calculator.calculate(number));
        }
    }
}
