import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<Integer>();
        for(int i =0; i<K; i++){
            int a = Integer.parseInt(br.readLine());
            if(a == 0){
                st.pop();
            }else{
                st.push(a);
            }
        }

        int sum = 0;
        for(int i : st){
            sum += i;
        }
        System.out.println(sum);
        br.close();
    }
}