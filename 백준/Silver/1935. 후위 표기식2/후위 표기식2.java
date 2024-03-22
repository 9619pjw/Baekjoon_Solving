import java.util.*;
import java.io.*;

class Main {
    static double tmp;
    static double tmp1;
    static double tmp2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Double> st = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];
        String s = br.readLine();

        for(int i =0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine()); 
        }
        
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case '+' :
                    tmp2 = st.pop();
                    tmp1 = st.pop();
                    tmp = tmp1 + tmp2;
                    st.add(tmp);
                    break;
                case '-' :
                    tmp2 = st.pop();
                    tmp1 = st.pop();
                    tmp = tmp1 - tmp2;
                    st.add(tmp);
                    break;
                case '*' :
                    tmp2 = st.pop();
                    tmp1 = st.pop();
                    tmp = tmp1 * tmp2;
                    st.add(tmp);
                    break;
                case '/' :
                    tmp2 = st.pop();
                    tmp1 = st.pop();
                    tmp = tmp1 / tmp2;
                    st.add(tmp);
                    break;
                default : // 연산자가 아닐 경우, 인덱스로 변환 후 해당 인덱스의 배열값을 스택에 넣음
                    int idx = s.charAt(i) - 'A'; 
                    st.add((double)arr[idx]);
                    break;
            }
        }
        double ans = st.pop();
        System.out.printf("%.2f\n", ans);
        br.close();
    }
}