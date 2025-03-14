package q11728;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        
        int num = n1 + n2;
        int[] arr = new int[num];
        
        for (int i = 0; i < n1; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            arr[n1 + i] = arr2[i];
        }
        
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
