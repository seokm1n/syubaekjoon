package q10039;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] score = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			if (score[i] < 40) {
				score[i] = 40;
			}
			sum += score[i];
		}
		sc.close();
		System.out.println(sum/score.length);
	}

}
