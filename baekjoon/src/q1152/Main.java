package q1152;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		sc.close();
		if (str.length() == 0)
			System.out.println(0);
		else {
			String[] s = str.split(" ");
			System.out.println(s.length);
		}
	}
}
