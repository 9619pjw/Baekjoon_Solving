import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
        int f= Integer.parseInt(br.readLine());
		n /= 100;
		for(int i=0;i<100;i++){
			if((n*100+i)%f==0) {
				System.out.printf("%02d",i);
				break;
			}
        }
        br.close();
	}
}