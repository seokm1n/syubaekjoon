package q2745;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		sc.close();
		
		int num = Integer.parseInt(str, n);
		System.out.println(num);
	}
}