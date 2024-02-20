import java.io.*;
import java.util.*;

class Main {
    // 6가지 이동 케이스를 표현하는 배열 ... A->B A->C B->A B->C C->A C->B
    static int[] Sender = {0, 0, 1, 1, 2, 2};
    static int[] Receiver = {1, 2, 0, 2, 0, 1};
    
    // A, B 무게만 있으면 C 무게가 고정되므로 2개만 체크
    static boolean visited[][] = new boolean[201][201];
    // 정답 배열
    static boolean answer[] = new boolean[201];
    // A, B, C값을 저장할 배열
    static int now[] = new int[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        now[0] = Integer.parseInt(st.nextToken()); // A
        now[1] = Integer.parseInt(st.nextToken()); // B
        now[2] = Integer.parseInt(st.nextToken()); // C
        
        BFS();

        for(int i = 0; i < answer.length; i++){
            if(answer[i])
                bw.write(i + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
        br.close();
    }
    public static void BFS(){
        Queue<AB> queue = new LinkedList<>();
        queue.add(new AB(0,0));
        visited[0][0] = true;
        answer[now[2]] = true;

        while(!queue.isEmpty()){
            AB p = queue.poll();
            int A = p.A;
            int B = p.B;
            int C = now[2] - A - B;
            
            // 6가지 케이스 반복 
            for(int i = 0; i < 6; i++){
                int[] next = {A, B, C};
                next[Receiver[i]] += next[Sender[i]];
                next[Sender[i]] = 0;

                if(next[Receiver[i]] > now[Receiver[i]]){ // 물이 넘칠 때
                    // 초과하는 만큼 다시 이전 물통에 넣어줌
                    next[Sender[i]] = next[Receiver[i]] - now[Receiver[i]];
                    next[Receiver[i]] = now[Receiver[i]]; // 대상 물통은 최대로 채움
                }

                if(!visited[next[0]][next[1]]){ // A와 B의 물의 양을 이용해 방문배열 체크
                    visited[next[0]][next[1]] = true;
                    queue.add(new AB(next[0], next[1]));
                    if(next[0] == 0)    // A의 물의 양이 0일 때 C의 물의 무게를 정답 변수에 저장
                        answer[next[2]] = true;
                }
            }
        }

    }
}

// A와 B의 값만 지니고 있으면 C를 유추할 수 있으므로 두 변수만 사용 
class AB{
    int A;
    int B;

    public AB(int A, int B){
        this.A = A;
        this.B = B;
    }
}