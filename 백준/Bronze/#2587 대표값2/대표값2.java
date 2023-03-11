import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum =0;
        int avg =0;
        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
      
        Arrays.sort(arr);
        avg = sum / 5;
        System.out.println(avg);
        System.out.println(arr[2]);
        br.close();
    }
}