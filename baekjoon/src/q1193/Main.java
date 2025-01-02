package q1193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();
        int count = 1;
        
        for (int i = 1; ; i++) {
        	int j = 1;
        	if (i % 2 == 0) {
        		for (j = 1; j <= 1; j++) {
        			if (count == X) {
        				System.out.println(j+"/"+(i-j+1));
        				break;
        			}
        			count++;
        		}
        	}else {
        		for (j = 1; j <= i; j++) {
        			if (count == X) {
        				System.out.println((i-j+1)+"/"+j);
        				break;
        			}
        			count++;
        		}
        	}
            if (j != i + 1) {
            	break;
            }
        }
    }
}