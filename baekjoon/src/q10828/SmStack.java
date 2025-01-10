package q10828;

public class SmStack {
	private int[] n;
	private int top;

	public SmStack(int p) {
		n = new int[p];
		top = -1;
	}

	public void push(int p) {
		n[++top] = p;
	}

	public void top() {
		if (top == -1) {
			System.out.println(top);
		} else {
			System.out.println(n[top]);
		}
	}

	public void size() {
		System.out.println(top + 1);
	}

	public void empty() {
		if (top == -1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public void pop() {
		if (top != -1) {
			System.out.println(n[top--]);
		} else {
			System.out.println(top);
		}
	}
}
