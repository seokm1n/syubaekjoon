package q3052;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt() % 42;
        }
        sc.close();

        int count = 0;
        for (int i = 0; i < 10; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) break;
            }
            if (j == i) count++;
        }
        System.out.println(count);
    }
}
