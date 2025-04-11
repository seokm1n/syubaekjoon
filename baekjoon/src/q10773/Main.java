package q10773;

import java.util.Scanner;
import java.util.Stack;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Stack<Integer> s = new Stack<Integer>();
      
      for (int i = 0, a; i < n; i++) {
         a = sc.nextInt();
         if (a == 0 && !s.isEmpty()) s.pop();
         else s.add(a);
         //System.out.println(s.peek());
      }
      sc.close();
      
      int sum = 0;
      if (!s.isEmpty()) for (int i : s) sum += i;
      System.out.println(sum);
   //   System.out.println(s.indexOf(1));
   }

}
