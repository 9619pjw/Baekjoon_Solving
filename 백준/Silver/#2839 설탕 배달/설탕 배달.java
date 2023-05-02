import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 배달할 설탕 무게
        int cnt = 0; // 설탕 개수
        
        while(N > 0){
            if (N % 5 == 0){ // 5로 나누어떨어지는 경우
                cnt += (N/5); // cnt 5로 나눈 몫만큼 증가
                N = 0;  // 조건문에서 나가기
            }else{ // 5로 안나누어 떨어지는 경우
                N -= 3; // 3씩 빼주어 5로 나누어떨어지게 함
                cnt++;  // 빼주는만큼 cnt 증가
            }

            if(N<0) // 5로 안나눠떨어짐 & 3씩뺐을때 음수가 되는경우 == 정확하게 맞출 수 없음
                cnt = -1;
        }
        System.out.println(cnt);
    }
}