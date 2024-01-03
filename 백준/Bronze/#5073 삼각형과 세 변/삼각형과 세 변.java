import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int arr[] = new int[3];

      while(true){
          StringTokenizer st = new StringTokenizer(br.readLine());
          arr[0] = Integer.parseInt(st.nextToken());
          arr[1] = Integer.parseInt(st.nextToken());
          arr[2] = Integer.parseInt(st.nextToken());
      
          Arrays.sort(arr);

          if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
          
          if(arr[2] >= arr[0] + arr[1]) // 삼각형의 조건을 만족하지 못함
            System.out.println("Invalid");
          else if(arr[0] == arr[1]){
            if(arr[1] == arr[2])
              System.out.println("Equilateral");
            else
              System.out.println("Isosceles");
          }else if (arr[1] == arr[2]){
            System.out.println("Isosceles");
          }else{
            System.out.println("Scalene");
          }
      }
      br.close();
  }
}