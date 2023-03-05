import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String arr[][] = new String[N][2];
        
        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
        Arrays.sort(arr, new Comparator<String[]>(){ // 나이를 기준으로 정렬
            @Override
            public int compare(String[] s1, String[] s2){
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });
        
        for(int i =0; i<N; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
        br.close();
    }
}