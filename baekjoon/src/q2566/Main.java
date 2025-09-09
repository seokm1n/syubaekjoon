package q2566;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		int max = arr[0][0];
		int maxi = 0;
		int maxj = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					maxi = i;
					maxj = j;
				}
			}
		}
		System.out.printf("%d\n%d %d", max, maxi + 1, maxj + 1);
	}
}