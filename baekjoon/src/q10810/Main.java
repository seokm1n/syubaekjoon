package q10810;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] arr = new int[M][3];
		int[] ar = new int[N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();

		for (int i = 0; i < M; i++) {
			for (int j = arr[i][0] - 1; j <= arr[i][1] - 1; j++) {
				ar[j] = arr[i][2];
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}
