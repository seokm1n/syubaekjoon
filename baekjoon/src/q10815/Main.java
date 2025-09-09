package q10815;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arrn = new int[n];
		for (int i = 0; i < n; i++) {
			arrn[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] arrm = new int[m];
		for (int i = 0; i < m; i++) {
			arrm[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < m; i++) {
			boolean check = false;
			for (int j = 0; j < n; j++) {
				if (arrm[i] == arrn[j]) {
					check = true;
				}
			}
			if (check == true) {
				System.out.print("1 ");
			} else {
				System.out.print("0 ");
			}
		}
	}
}
