import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> hashMap = new HashMap<>();
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String Key = st.nextToken();
            String Value = st.nextToken();
            hashMap.put(Key, Value);
        }

        for(int i =0; i < M; i++){
            String s = br.readLine();
            bw.write(hashMap.get(s)+ "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}