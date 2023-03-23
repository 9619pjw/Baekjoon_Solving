import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");
        int[] arr = new int[s.length];
        for (int i =0; i<s.length; i++){
            arr[i] = Integer.parseInt(s[i]); // 배열에 숫자 저장
        }

        for(int i = 0; i<arr.length; i++){
            int max = i;
            for(int j = i+1; j<arr.length; j++){
                if (arr[j] > arr[max])
                    max = j; // 최댓값 찾기
            }
            if(arr[i] < arr[max]){
                int tmp = arr[i];
                arr[i] = arr[max];
                arr[max] = tmp;
            }
        }
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        
        br.close();
    }
}