package q3040;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		sc.close();

		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				int rest = arr[i] + arr[j];
				if (sum - rest == 100) {
					for (int k = 0; k < 9; k++) {
						if (k != i && k != j)
							System.out.println(arr[k]);
					}
				}
			}
		}
	}
}