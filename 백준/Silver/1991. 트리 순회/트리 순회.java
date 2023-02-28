import java.io.*;

class Main{
    static int[][] tree;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 이진 트리의 노드 개수
        tree = new int[26][2];

        for(int i =0; i<N; i++){
            String[] st = br.readLine().split(" ");
            int node = st[0].charAt(0) - 'A'; // index로 변환하기 위해 A를 빼줌
            char left = st[1].charAt(0);
            char right = st[2].charAt(0);

            if(left == '.'){
                tree[node][0] = -1; // 자식노드 없을 때 -1 저장
            }else{
                tree[node][0] = left - 'A';
            }
            if(right == '.'){
                tree[node][1] = -1;
            }else{
                tree[node][1] = right - 'A';
            }
        }
        PreOrder(0);
        System.out.println();
        InOrder(0);
        System.out.println();
        PostOrder(0);
        System.out.println();
        br.close();
    }
    public static void PreOrder(int x){ // 전위
        if(x == -1)
            return;
        System.out.print((char)(x + 'A')); // 현재 노드
        PreOrder(tree[x][0]); // 왼쪽 탐색
        PreOrder(tree[x][1]); // 오른쪽 탐색       
    }
    public static void InOrder(int x){ // 중위
        if(x == -1)
            return;
        InOrder(tree[x][0]); // 왼쪽 탐색
        System.out.print((char)(x + 'A'));// 현재 노드
        InOrder(tree[x][1]); // 오른쪽 탐색
    }
    public static void PostOrder(int x){ // 후위
        if(x == -1)
            return;
        PostOrder(tree[x][0]);// 왼쪽 탐색
        PostOrder(tree[x][1]);// 오른쪽 탐색
        System.out.print((char)(x + 'A'));// 현재 노드
    }
}