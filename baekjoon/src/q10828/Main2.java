package q10828;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> sm = new Stack<Integer>();

		int cmdNum = sc.nextInt();
		for (int i = 0; i < cmdNum; i++) {
			String cmd = sc.next();

			switch (cmd) {
			case "push":
				int num = sc.nextInt();
				sm.push(num);
				break;
			case "top":
				System.out.println(sm.peek());
				break;
			case "size":
				System.out.println(sm.size());
				break;
			case "empty":
				if (sm.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}

				break;
			case "pop":
				if (!sm.isEmpty())
					System.out.println(sm.pop());
				else
					System.out.println(-1);
				break;
			}
		}
		sc.close();
	}
}