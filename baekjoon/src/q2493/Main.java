package q2493;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < n; i++) {
			boolean found = false;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[i]) {
					System.out.print((j + 1) + " ");
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.print("0 ");
			}
		}
	}
}
