import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int cnt = 0; // 좋은 숫자를 세는 변수
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            int s = 0; // 시작 인덱스
            int e = N - 1; // 끝 인덱스
            int target = arr[i]; // 타겟
            while (s < e) {
                if (arr[s] + arr[e] == target) { // 찾고자 하는 값 발견 시
                    if (s != i && e != i) { // 서로 다른 수이면
                        cnt++;      // 좋은 수 개수 추가
                        break;
                    } else if (s == i) { // 인덱스 조정
                        s++; 
                    } else if (e == i) {
                        e--;
                    }
                } else if (arr[s] + arr[e] < target) {
                    s++;
                } else {
                    e--;
                }
            }

        }
        System.out.println(cnt);
        br.close();
    }
}