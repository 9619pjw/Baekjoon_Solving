import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
      while(true){
        int n = Integer.parseInt(br.readLine());
        // 입력값 종료
        if( n == -1 || n == 0 ) break;

        int[] arr = new int[n]; 
        int count = 0;
        int sum = 0;
        
        for(int i = 1; i <= n; i++){
          if( n % i == 0 && n!=i ){ // 나누어떨어짐 && 자기 자신이 아님
            arr[count] = i; // 약수를 배열에 저장함
            count++;
            sum += i; 
          }
        }

        if(n == sum){ // 완전수의 경우
          System.out.print(n + " = ");

          for(int i = 0; i < n; i++){
            if(n/2 == arr[i]){ // 마지막 약수의 경우 줄바꿈 출력
              System.out.println(arr[i]);
            }else if(arr[i]!=0) { // 나머지 약수들은 + 와 출력
              System.out.print(arr[i] + " + ");
            }
          }
        }else if (n != sum){ // 완전수가 아닌 경우
          System.out.println(n + " is NOT perfect.");
        }
      }
  }
}