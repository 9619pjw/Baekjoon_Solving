import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); // 재료의 개수
        int M = Integer.parseInt(br.readLine()); // 갑옷이 완성되는 번호의 합
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 숫자 입력받음
        }

        Arrays.sort(arr); // 배열 정렬함
        int front = 0;
        int rear = N - 1;
        int cnt = 0;
        while (front < rear) {
            if (arr[front] + arr[rear] < M) { // 갑옷보다 작으면 front 조정
                front++;
            } else if (arr[front] + arr[rear] > M) { // 갑옷보다 큰 숫자가 나오면 rear 조정
                rear--;
            } else { // 갑옷이 만들어지면 갑옷 개수 추가 및 인덱스 조정
                cnt++;
                front++;
                rear--;
            }
        }
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}