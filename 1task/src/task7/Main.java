package task7;

import task7.ShellSort.ShellSort;

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

        ShellSort.Sort(array);
        System.out.println("Sorted array");
        PrintArray(array);
    }

    private static void PrintArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
