package q2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int i = 1;
		for (int sum = 0; sum + 1 < n; sum += i * 6, i++) {
		}
		System.out.println(i);
	}
}
