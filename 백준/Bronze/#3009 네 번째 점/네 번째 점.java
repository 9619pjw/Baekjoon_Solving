import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int map[][] = new int[4][2];

    for (int i = 0; i < 3; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      map[i][0] = Integer.parseInt(st.nextToken());
      map[i][1] = Integer.parseInt(st.nextToken());
    }

    // x좌표
    if (map[0][0] == map[1][0]) {
      map[3][0] = map[2][0];
    } else if (map[0][0] == map[2][0]) {
      map[3][0] = map[1][0];
    } else {
      map[3][0] = map[0][0];
    }

    // y좌표
    if (map[0][1] == map[1][1]) {
      map[3][1] = map[2][1];
    } else if (map[0][1] == map[2][1]) {
      map[3][1] = map[1][1];
    } else {
      map[3][1] = map[0][1];
    }

    System.out.println(map[3][0] + " " + map[3][1]);

    br.close();

  }
}
