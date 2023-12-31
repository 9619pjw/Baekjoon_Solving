import java.io.*;

class Main{
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int A = Integer.parseInt(br.readLine());
      int B = Integer.parseInt(br.readLine());
      br.close();

      System.out.print(A*B);
  }
}