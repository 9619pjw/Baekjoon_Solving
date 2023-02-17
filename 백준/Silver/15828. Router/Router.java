import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b_size = Integer.parseInt(br.readLine()); // 버퍼의 크기
        int N =0; // 라우터가 처리할 정보들
        Queue<Integer> buf = new LinkedList<Integer>();
       
        while(N != -1){ // -1 입력될 때까지 반복
            N = Integer.parseInt(br.readLine()); // 라우터가 처리할 정보 입력
            if(N == 0){
                buf.poll(); // 패킷 처리함
            }else{
                if(N > 0 && buf.size() < b_size) // 0보다 큰값 & 버퍼크기가 최대치가 아니면 
                    buf.offer(N); // 버퍼에 저장
            }
        }

        if(buf.isEmpty()) // 버퍼에 아무것도 없으면
            System.out.println("empty");
        else{
            while(!buf.isEmpty()){ // 버퍼를 비워주며 출력
                System.out.print(buf.poll() + " ");
            }
        }
        br.close();
    }
}