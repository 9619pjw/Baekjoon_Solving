import java.util.*;
import java.io.*;

class Main {
    static ArrayList<Integer>[] tree;
    static boolean visited[];
    static int answer = 0;
    static int deleteNode = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        tree = new ArrayList[N];
        visited = new boolean[N];
        int root = 0;

        for(int i = 0; i < N; i++){
            tree[i] = new ArrayList<Integer>();
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp != -1){
                tree[i].add(tmp);
                tree[tmp].add(i);
            }else{ // 루트 노드 갱신
                root = i;
            }
        }
        deleteNode = Integer.parseInt(br.readLine());
        
        if(deleteNode == root)
            bw.write(0 + "\n");
        else{
            dfs(root);
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int number){
        visited[number] = true;
        // 자식 노드
        int cNode = 0; 
        for(int i : tree[number]){
            if(!visited[i] && i != deleteNode){
                cNode++;
                dfs(i);
            }
        }
        // 자식노드가 0 == 리프노드
        if(cNode == 0)
            answer++;
    }
}