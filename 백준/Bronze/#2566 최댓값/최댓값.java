import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int maxNum = -1;
    String result = "";
    for ( int i = 1; i <= 9; i++ ) {
        st = new StringTokenizer(br.readLine());
        for ( int j = 1; j <= 9; j++ ) {
            int tempNum = Integer.parseInt(st.nextToken());
            if ( tempNum > maxNum) {
              maxNum = tempNum;
              result = i + " " + j;
            }
        }
    }

    System.out.println(maxNum + "\n" + result);
  } 
}