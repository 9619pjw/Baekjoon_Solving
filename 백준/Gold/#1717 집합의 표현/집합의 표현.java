import java.io.*;
import java.util.*;

class Main {
    public static int[] parent; // 대표노드 저장배열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        parent = new int[N+1];

        // 대표 노드 자기 자신으로 초기화
        for(int i = 0; i <= N; i++){
            parent[i] = i;
        }

        // T = 0이면 union연산, T = 1이면 checkSame연산
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(T == 0){ // 합집합
                union(A,B);
            }else{
                if(checkSame(A,B)){
                    bw.write("YES" + "\n");
                }else{
                    bw.write("NO" + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

    // union 연산 ... 두 원소의 대표 노드 찾아서 연결
    public static void union(int a, int b){
        a = find(a);
        b = find(b);

        if(a != b)
            parent[b] = a;
    }

    // find 연산 ... 대표노드면 반환, 아닌 경우 재귀 형태로 대표노드 탐색
    public static int find(int a){
        if(a == parent[a])
            return a;
        else
            return parent[a] = find(parent[a]);
    }

    // 두 원소가 같은 집합인지 확인
    public static boolean checkSame(int a, int b){
        a = find(a);
        b = find(b);
        if(a == b){
            return true;
        }
        return false;
    }
}