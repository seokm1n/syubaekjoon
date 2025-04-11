package q2525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int time = a * 60 + b + c;
		int hour = (time / 60) % 24;
		int minute = time % 60;
		System.out.printf("%d %d", hour, minute);
	}
}
