import java.io.*;
import static java.lang.Math.sqrt;

class Main{
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      StringBuilder sb = new StringBuilder();
      
      for(int i = 2; i <= sqrt(N) ; i++){
        while(N % i == 0){
          N /= i;
          sb.append(i + "\n");
        }
      }

      if(N != 1){
        sb.append(N);
      }

      System.out.println(sb);
      br.close();
  }
}