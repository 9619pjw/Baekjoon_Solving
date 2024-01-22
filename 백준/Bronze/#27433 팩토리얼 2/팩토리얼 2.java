import java.util.*;
import java.io.*;
class Main{
  public static void main(String[] args)throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
      int N = Integer.parseInt(br.readLine());

      System.out.println(factorial(N));
      br.close();
  }

  static long factorial(int a){
    if(a <= 0){
      return 1;
    }
    return a * factorial(a-1);
  }
}