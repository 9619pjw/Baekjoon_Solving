import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int V = Integer.parseInt(s[2]);
        
        int cnt = (V-B) / (A-B);
        if((V-B)%(A-B)!=0){
            cnt++;
        }
        
        System.out.println(cnt);
        br.close();
    }
}