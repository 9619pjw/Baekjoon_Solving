import java.util.*;
import java.io.*;

class Main{
    static Stack st;
    static String[] s;
    static boolean inout; 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i =0; i<N; i++){
            s = br.readLine().split("");
            st = new Stack();
            inout = true;
            for(int j = 0; j <s.length; j++){
                switch(s[j]){
                    case "(":
                        st.push("(");
                        break;
                    case ")":
                        if(st.isEmpty()){
                            inout = false; // 스택이 비어있었으면 개수가 안맞음
                        }else{
                            st.pop();
                        }
                        break;
                    default:
                        break;
                }
            }
        if(inout == true && st.empty()){ // '('와 ')' 개수 맞는지 확인
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        }
        br.close();
    }
}