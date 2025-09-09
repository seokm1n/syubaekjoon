package q12789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int index = 1;
        String result = "Nice";
        String[] sArr = br.readLine().split(" ");
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            int currentNum = Integer.parseInt(sArr[i]);
            if(index != currentNum){
                if(!stack.isEmpty() && index == stack.peek()){
                    index++;
                    i--;
                    stack.pop();
                } else {
                    stack.push(currentNum);
                }
            } else {
                index++;
            }
        }

        while(!stack.isEmpty()){
            int pop = stack.pop();
            if(pop == index){
                index++;
            } else {
                result = "Sad";
                break;
            }
        }
        System.out.println(result);
    }
}