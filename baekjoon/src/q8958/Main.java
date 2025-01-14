package q8958;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] str = new String[N];

		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		sc.close();

		for (int i = 0; i < N; i++) {
			int score = 0;
			int sum = 0;
			for (int j = 0; j < str[i].length(); j++) {

				if (str[i].charAt(j) == 'O') {
					sum += ++score;
				} else {
					score = 0;
				}
			}
			System.out.println(sum);
		}
	}
}
