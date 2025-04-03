package q1254;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String words = sc.nextLine();
		sc.close();
		System.out.println(makePalindrome(words));
				
	}
	
	public static int makePalindrome(String words){
		int size = words.length();
		int j = size - 1;
		int result = size;
		int oldJ = 0;
		boolean matching = false;
		for(int i = 0; i < size; i++){
			if(i == j)
				break;
			else{
				if(words.charAt(i) != words.charAt(j)){
					if(matching){
						matching = false;
						if(words.charAt(i) != words.charAt(oldJ)){
							result = size + i + 1;
							j = oldJ;
						}
						else
							result = size + i;
					}
					else
						result++;
				}
				else{
					oldJ = j;
					j--;
					matching = true;
				}
			}
		}
		return result;
	}	
}