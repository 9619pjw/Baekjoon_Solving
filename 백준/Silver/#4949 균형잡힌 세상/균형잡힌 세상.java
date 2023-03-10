import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int cnt = 0;
            String[] s = br.readLine().split("");
            if(s[0].equals(".")){
                break;
            }
            Stack <String> st = new Stack<String>();
            for(int i =0; i<s.length; i++){
                if(s[i].equals("(") || s[i].equals("[")){ // ( 나 [ 가 나오면 스택에 삽입
                    st.push(s[i]);
                }
                if(s[i].equals(")")){
                    if(st.isEmpty()){   // 비어있을 경우
                        cnt++;          // 횟수 증가
                        break;
                    }
                    if(st.pop().equals("(")){ // 스택에 ( 가 있을 경우
                        continue;       // 계속 진행
                    }else{      // () 완성하지 못했을 경우
                        cnt++;
                        break;
                    }
                }
                if(s[i].equals("]")){
                    if(st.isEmpty()){
                        cnt++;
                        break;
                    }
                    if(st.pop().equals("[")){
                        continue;
                    }else{
                        cnt++;
                        break;
                    }
                }
            }
            if(st.size() == 0 && cnt == 0)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        br.close();
    }
}