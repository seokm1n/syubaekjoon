package q10988;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String word = sc.next();
      sc.close();
      
      String reverseWord = "";
      for(int i=word.length()-1; i>=0; i--) {
         reverseWord = reverseWord + word.charAt(i);
      }
      
      if(word.equals(reverseWord)) {
         System.out.println(1);
      }else {
         System.out.println(0);
      }
   }
}