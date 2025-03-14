package q4949;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();

		while (true) {
			String str = sc.nextLine();
			if (str.equals(".")) {
				break;
			}
			arr.add(str);
		}
		for (int i = 0; i < arr.size(); i++) {
			if (check(arr.get(i))) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		sc.close();
	}

	public static boolean check(String str) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == '(' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			} else if (ch == ']') {
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
