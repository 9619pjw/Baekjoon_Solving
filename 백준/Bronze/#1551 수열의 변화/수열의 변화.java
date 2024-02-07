import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
        int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		String[] s=br.readLine().split(",");
		int[] data=new int[n];
		
        for(int i=0;i<n;i++) {
			data[i]=Integer.parseInt(s[i]);
		}
		
		int cur=n;
		for(int i=0;i<k;i++) {
			for(int j=0;j<cur-1;j++) {
				data[j]=data[j+1]-data[j];
			}
			cur--;
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<cur;i++) {
			sb.append(data[i]+",");
		}
		System.out.println(sb.toString().substring(0,sb.length()-1));
	}
}