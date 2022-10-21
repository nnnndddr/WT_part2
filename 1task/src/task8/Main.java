package task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input size of 1:");
        int[] seq1 = inputArray();

        System.out.println("Input size of 2:");
        int[] seq2 = inputArray();

        int[] indexes = SequenceSolver.MergeSequencesIndexes(seq1, seq2);

        PrintArray(indexes);
    }

    private static int[] inputArray() {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        var array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input element " + (i + 1) + ":");
            array[i] = console.nextInt();
        }

        return array;
    }

    private static void PrintArray(int[] array) {
        for (int number : array) {
            System.out.print(number + 1 + " ");;
        }
    }
}
