package q18185;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int[] ar = new int[n + 2];
      for (int i = 0; i < n; i++) {
         ar[i] = sc.nextInt();
      }
      sc.close();

      int cnt = 0;
      for (int i = 0; i < n; i++) {
         if (ar[i] == 0) {
            continue;
         }

         if (i + 1 < n && i + 2 < n && ar[i + 1] > ar[i + 2]) {
            int buy = Math.min(ar[i], ar[i + 1] - ar[i + 2]);
            ar[i] -= buy;
            ar[i + 1] -= buy;
            cnt += buy * 5;
         }

         if (i + 1 < n && i + 2 < n) {
            int buy = Math.min(ar[i], Math.min(ar[i + 1], ar[i + 2]));
            ar[i] -= buy;
            ar[i + 1] -= buy;
            ar[i + 2] -= buy;
            cnt += buy * 7;
         }

         if (i + 1 < n) {
            int buy = Math.min(ar[i], ar[i + 1]);
            ar[i] -= buy;
            ar[i + 1] -= buy;
            cnt += buy * 5;
         }

         cnt += ar[i] * 3;
         ar[i] = 0;
      }
      System.out.println(cnt);
   }
}
