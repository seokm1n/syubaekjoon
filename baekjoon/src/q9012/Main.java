package q9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] str = new String[T];
		
		for (int i = 0; i < T; i++) {
			Stack<Character> stack = new Stack<>();
			str[i] = sc.next();

			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) == '(') {
					stack.push('(');
				} else {
					if (stack.empty()) {
						stack.push(')');
						break;
					} else
						stack.pop();
				}
			}
			if (stack.empty())
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
}