package task4.data;

import java.util.Scanner;

public class Arr {
    public final int [] ARRAY;
    public final int LENGTH;
    public Arr (int N ){
        ARRAY = new int[N];
        LENGTH = N;
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            ARRAY [i] = console.nextInt();
        }
    }
}
