import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];
        int[] arr2 = new int[4];
        int sum = 0;
        int sum2 = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
            sum2 += arr2[i];
        }

        if (sum >= sum2) {
            System.out.println(sum);
        } else {
            System.out.println(sum2);
        }
        br.close();
    }
}