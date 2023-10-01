import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Integer [] score = new Integer[4];
    Integer [] score2 = new Integer[2];
    
    int sum = 0;

    for(int i = 0; i < score.length; i++){
      score[i] = Integer.parseInt(br.readLine());
    }

    for(int i = 0 ; i < score2.length; i++){
      score2[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(score, Collections.reverseOrder());
    Arrays.sort(score2, Collections.reverseOrder());

    for(int i = 0 ; i < 3; i++){
      sum += score[i];
    }

    for(int i = 0 ; i < 1; i++){
      sum += score2[i];
    }

    
    System.out.println(sum);
    br.close();

  }
}
