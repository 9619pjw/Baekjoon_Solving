import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        
        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < N; i++){ 
            StringTokenizer st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            Integer value = Integer.parseInt(st.nextToken());
            
            if(hashMap.containsKey(key)){
                hashMap.put(key, hashMap.get(key)+ value);
            }
            else{
                hashMap.put(key, value);
            }
        }

        if(hashMap.containsValue(5)){
            bw.write("YES\n");
        }else{
            bw.write("NO\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}