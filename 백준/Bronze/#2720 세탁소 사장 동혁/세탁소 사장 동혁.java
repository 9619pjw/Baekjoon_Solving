import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int cent[] = {25, 10, 5, 1};
        for(int i = 0 ; i < T; i++ ){
            int a = Integer.parseInt(br.readLine());
            int amount[] = {0, 0, 0, 0};
            while(a > 0){
                int j = 0;
                while(true){
                    if(a >= cent[j]){
                        a -= cent[j];
                        amount[j]++;
                        break;
                    }
                    else
                        j++;
                }
            }
            System.out.println(amount[0] + " " + amount[1] + " " + amount[2] + " " + amount[3]);
        }
        
        br.close();
    }
}