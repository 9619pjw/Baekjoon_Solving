import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine()); // 컵을 바꾸는 횟수

        int ans = 1; // 공이 있는 컵의 번호

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            if (ans == X) {
                ans = Y;    // 공은 Y컵 아래에 있음
            } else if (ans == Y) {
                ans = X;    // 공은 X컵 아래에 있음
            } else {
                continue;
            }
        }
        System.out.println(ans);
        br.close();
    }
}