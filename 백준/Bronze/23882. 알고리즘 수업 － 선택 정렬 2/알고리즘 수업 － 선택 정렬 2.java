import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 배열 a의 크기
        int k = Integer.parseInt(st.nextToken()); // 교환 횟수

        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int i;
        int maxIndex = 0;
        int count = 0; // 교환 횟수 카운트
        for (i = n - 1; i > 0; i--) {
            maxIndex = i;

            //최대값을 갖고 있는 인덱스 찾기
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > a[maxIndex]) {
                    maxIndex = j;
                }
            }

            // i번째 값과 찾은 최대값을 서로 교환
            if (maxIndex == i) {
                continue;
            }

            swap(a, maxIndex, i);
            count++;

            if (count == k) {
                break;
            }
        }

        if (count < k) {
            System.out.println(-1);
        } else {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", a[j]);
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}