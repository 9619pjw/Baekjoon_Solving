import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Balloon> dq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine()); // 풍선의 개수
        int[] balloonLocation = new int[N]; // 풍선 위치담는 배열

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            balloonLocation[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        sb.append("1 "); // 첫번째 풍선 터트림
        int moveValue = balloonLocation[0]; // 움직일 값

        // 인덱스값과 인덱스가 가지고 있는 이동 값을 같이 넣어줌
        for(int i = 1; i < N; i++){
            dq.add(new Balloon(i+1, balloonLocation[i])); // 첫번째 값은 제외
        }


        while(!dq.isEmpty()){
            if(moveValue > 0){ // 양수일 경우 인덱스가 큰 쪽으로
                for(int i = 1; i < moveValue; i++){
                    dq.add(dq.poll()); // 앞의 요소를 모두 뒤로 보냄
                }
                Balloon next = dq.poll();
                moveValue = next.numValue;   // 이동값 갱신
                sb.append(next.index + " ");
            }else{ // 음수일 경우 인덱스가 작은 쪽으로
                for(int i = 1; i < -moveValue; i++){
                    dq.addFirst(dq.pollLast()); // 뒤의 요소를 모두 앞으로 보냄
                }
                Balloon next = dq.pollLast();
                moveValue = next.numValue;
                sb.append(next.index + " ");
            }
        }
        System.out.println(sb);
    }
}
class Balloon {
    int index;
    int numValue;

    public Balloon(int index, int numValue){
        this.index = index;
        this.numValue = numValue;
    }
}