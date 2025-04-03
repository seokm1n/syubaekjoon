package q1920;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar1 = new int[n];
		for (int i = 0; i < n; i++) {
			ar1[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int[] ar2 = new int[m];
		for (int i = 0; i < m; i++) {
			ar2[i] = sc.nextInt();
		}

		Map<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(ar1[i], true);
		}

		for (int i = 0; i < m; i++) {
			if (map.containsKey(ar2[i])) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
		sc.close();
	}
}