package q2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int b1 = b/100;
		int b2 = b%100/10;
		int b3 = b%10;
		
		int result1 = a*b3;
		int result2 = a*b2;
		int result3 = a*b1;
		int result = a*b;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result);
	}
}
