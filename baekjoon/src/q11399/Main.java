package q11399;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(p);

		int time = 0;
		for (int i = 0; i < n; i++) {
			time += (n - i) * p[i];
		}
		System.out.println(time);
	}
}