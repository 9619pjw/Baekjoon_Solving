import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int arr[] = new int[10];

        char c[] = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            int num = c[i] -'0';

            // 6과 9는 뒤집어서 사용할 수 있으므로 9의 index는 없앰
            if(num == 9)
                num = 6;

            arr[num]++;
        }
        
        // index가 6인 arr[]의 count값을 반으로 나눔
        arr[6] = (arr[6] / 2) + (arr[6] % 2);
        Arrays.sort(arr);

        // 정렬 후 가장 큰 count값을 출력함.
        System.out.println(arr[9]);
        br.close();
    }
}