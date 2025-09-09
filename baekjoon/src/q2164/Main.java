package q2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Queue<Integer> q = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			q.add(i);
		}

		while (true) {
			if (q.size() == 1) {
				break;
			}

			q.remove();

			if (q.size() == 1) {
				break;
			}

			int top = q.peek();
			q.remove();
			q.add(top);
		}

		System.out.println(q.peek());

		sc.close();
	}
}