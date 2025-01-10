package q10845;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> sm = new LinkedList<Integer>();

		int cmdNum = sc.nextInt();
		int last = 0;

		for (int i = 0; i < cmdNum; i++) {
			String cmd = sc.next();

			switch (cmd) {
			case "push":
				int num = sc.nextInt();
				sm.add(num);
				last = num;
				break;
			case "pop":
				if (!sm.isEmpty())
					System.out.println(sm.remove());
				else
					System.out.println(-1);
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
			case "front":
				if (sm.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(sm.peek());
				}
				break;
			case "back":
				if (sm.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(last);
				}
				break;
			}
		}
		sc.close();
	}
}