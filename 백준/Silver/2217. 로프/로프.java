import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer arr[] = new Integer[N];
        
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());    
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int result = 0;

        for(int i = 0; i < N; i++){
            result = Math.max(result, arr[i] * (i+1));
        }

        System.out.println(result);
        br.close();
    }
}