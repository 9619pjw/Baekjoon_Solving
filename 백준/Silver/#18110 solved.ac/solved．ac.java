import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int num = (int)Math.round(n * 0.15); // 절사할 인원의 수
		double sum = 0;
		for(int i = num; i< n-num; i++) // 위 아래 절사 후 남은 인원들로 평균 계산 
			sum += arr[i];
		System.out.println((int)Math.round(sum/(n-num*2)));
    }
}