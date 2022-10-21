package task1;

import task1.Calculator.CalculatorFunction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner console  =new Scanner(System.in);

        var calculator = new CalculatorFunction();

        System.out.println("Input x:");
        double x = console.nextDouble();
        System.out.println("Input y:");
        double y = console.nextDouble();

        System.out.printf("Result = " + calculator.calculate(x, y));
    }


}
