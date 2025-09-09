package q16953;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int count = 1;

		while (true) {
			if (a == b) {
				System.out.println(count);
				break;
			} else if (b < a) {
				System.out.println("-1");
				break;
			} else if (b % 10 == 1) {
				b /= 10;
				count++;
			} else if (b % 2 == 0) {
				b /= 2;
				count++;
			} else {
				System.out.println("-1");
				break;
			}
		}
	}
}
