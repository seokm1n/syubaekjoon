package q1110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int ans = n;
		int N = 0;
		int count = 0;
		
		while (N != n) {
			N = ans;
			count++;
			if (n < 10) {
				n = n * 10 + n;
			} else {
				n = (n % 10) * 10 + ((n % 10) + (n / 10)) % 10;
			}
		}
		if (n == 0)
			count = 1;
		System.out.println(count);
	}
}
