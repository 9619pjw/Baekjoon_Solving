import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<cNode>[] A;    // 인접리스트
    static long lcm;                // 최소 공배수
    static boolean visited[];       // DFS 탐색 여부
    static long D[];                // 각 노드값 저장 배열
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       int N = Integer.parseInt(br.readLine());
       A = new ArrayList[N];
       visited = new boolean[N];
       D = new long[N];

       lcm = 1;
       for(int i =0; i < N; i++){
           A[i] = new ArrayList<cNode>();
       }

       for(int i  = 0; i < N -1; i++){
           StringTokenizer st = new StringTokenizer(br.readLine());
           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st.nextToken());
           int p = Integer.parseInt(st.nextToken());
           int q = Integer.parseInt(st.nextToken());
           A[a].add(new cNode(b,p,q));
           A[b].add(new cNode(a,q,p));
           lcm *= (p*q / gcd(p,q)); // 최소 공배수 = 두 수의 곱 / 최대 공약수
       }

       D[0] = lcm;
       DFS(0);
       long mgcd = D[0];

       for(int i = 1; i < N; i++){
           mgcd = gcd(mgcd, D[i]);
       }
       for(int i = 0; i < N; i++){
           bw.write(D[i] / mgcd + " ");
       }
       bw.flush();
       bw.close();
       br.close();
    }
    // 최대 공약수 함수 구현
    public static long gcd(long a, long b){
        if(b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
    // 탐색 함수
    public static void DFS(int Node){
        visited[Node] = true;
        for(cNode i : A[Node]){
            int next = i.getB();
            if(!visited[next]){
                D[next] = D[Node] * i.getQ() / i.getP(); // 주어진 비율로 다음 노드값 갱신
                DFS(next);
            }
        }
    }
}

class cNode{
    int b, p, q;
    public cNode(int b, int p, int q){
        super();
        this.b = b;
        this.p = p;
        this.q = q;
    }
    public int getB(){
        return b;
    }
    public int getP(){
        return p;
    }
    public int getQ(){
        return q;
    }
}
