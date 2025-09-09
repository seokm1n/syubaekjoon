package q2346;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] bal = new int[n];
		for (int i = 0; i < n; i++) {
			bal[i] = sc.nextInt();
			if (bal[i]<0) {
				bal[i] += 5;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(bal[bal[i] + i] + " ");
		}
	}
}
