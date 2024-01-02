import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      int arrX[] = new int[N];
      int arrY[] = new int[N];

      for(int i = 0; i < N; i++){
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arrX[i] = Integer.parseInt(st.nextToken());
        arrY[i] = Integer.parseInt(st.nextToken());
      }
      br.close();
      
      Arrays.sort(arrX);
      Arrays.sort(arrY);

      int X = arrX[N-1] - arrX[0];
      int Y = arrY[N-1] - arrY[0];

      System.out.print(X * Y);
  }
}