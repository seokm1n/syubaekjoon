package q10828;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SmStack sm = new SmStack(10000);
		
		int cmdNum = sc.nextInt();
		for (int i = 0; i < cmdNum; i++) {
			String cmd = sc.next();
			
			switch (cmd) {
			case "push":
				int num = sc.nextInt();
				sm.push(num);				
				break;
				
			case "pop":
				sm.pop();
				break;
				
			case "size":
				sm.size();
				break;
				
			case "empty":
				sm.empty();
				break;
				
			case "top":
				sm.top();
				break;
			}	
		}
		sc.close();
	}
}
