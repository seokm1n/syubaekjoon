package q1913;
//제일 처음값이 이상하게 나옴

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		int arr[][] = new int[N][N];
		int num = N * N;
		int[] t = new int[2];
		arr[N/2][N/2] = 1;
		
		for(int k = 0; k < N; k++) {
			for(int i = k; i < N - k; i++) {
				arr[i][k] = num--;
			}
			for(int i = k + 1; i < N-(k+1); i++) {
				arr[N-(k+1)][i] = num--;
			}
			for(int i = N-(k+1); i >= k; i--) {
				arr[i][N-(k+1)] = num--;
			}
			for(int i = N-(k+2); i >= (k+1); i--) {
				arr[k][i] = num--;
			}
		}

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if (m == arr[i][j]) {
					t[0] = i+1;
					t[1] = j+1;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
				arr[N/2][N/2] = 1;
			}
			System.out.println();
		}
		System.out.println(t[0] + " " + t[1]);
		
	}
}