// 코딩테스트 합격자 되기 자바편 문제 09
import java.util.*;

class Solution{
    public static void main(String[] args) {
        
        System.out.println(solution(10));
        System.out.println(solution(27));
        System.out.println(solution(12345));
    }

    public static String solution(int dirs) {

        Stack<Integer> st = new Stack<>();
        
        while(dirs > 0){
            st.push(dirs % 2);
            dirs /= 2;
        }
        
        StringBuilder answer = new StringBuilder();
        while(!st.isEmpty()){
            answer.append(st.pop())
        }
        
        return answer;
    }
}
