import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Queue<Integer> q = new LinkedList<Integer>();

        for(int i = 0; i<N; i++){
            q.add(i+1);         // 1부터 N까지 카드 삽입
        }

        while(q.size()>1){      // 하나의 카드가 남을때까지 반복
            q.poll();
            int tmp = q.poll(); // 다시 삽입할 값 임시변수에 저장
            q.add(tmp);
        }

        System.out.println(q.poll());
    }
}