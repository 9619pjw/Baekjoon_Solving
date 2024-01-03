import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      br.close();

      // 역삼각형 출력
      for(int i = N; i > 0; i--){
        for(int j = 0; j < N-i ; j++){
          System.out.print(" ");
        }
        for(int j = 0; j < (i-1)*2 + 1 ; j++){
          System.out.print("*");
        }
        System.out.println();
      }

      // 삼각형 출력
      for(int i = 2; i <= N; i++){
        for(int j = 0; j < N-i; j++){
          System.out.print(" ");
        }
        for(int j = 0; j < (i-1)*2 + 1 ; j++){
          System.out.print("*");
        }
        System.out.println();
      }
  }
}