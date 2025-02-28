package q28278;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[]args) throws IOException {
      // 입력용 BufferedReader, 출력용 BufferedWriter 초기화
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int sizeArray =  Integer.parseInt(bf.readLine()); 
      List<Integer> stack = new ArrayList<>();
      StringTokenizer st;
      for(int i=0;i<sizeArray;i++) {
          st=new StringTokenizer(bf.readLine());
          int command=Integer.parseInt(st.nextToken());
          if(command==1) {
             stack.add(Integer.parseInt(st.nextToken()));
          }else if(command==2) {
             if(stack.isEmpty()) {
                bw.write("-1\n");;
             }else {
                bw.write(stack.get(stack.size()-1)+"\n");
                stack.remove(stack.size()-1);
             }
          }else if(command==3) {
             bw.write(stack.size()+"\n");
          }else if(command==4) {
             if(stack.isEmpty()) {
                bw.write("1\n");
             }else {
                bw.write("0\n");
             }
          }else if(command==5) {
             if(stack.isEmpty()) {
                bw.write("-1\n");
             }else {
                bw.write(stack.get(stack.size()-1)+"\n");
             }
          }
      }
       // 자원 정리 및 출력
        bw.flush();
        bw.close();
        bf.close();
      
   }

}