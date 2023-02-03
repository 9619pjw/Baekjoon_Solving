import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int N=Integer.parseInt(br.readLine());       
		ArrayList<Integer> list=new ArrayList<>();  // Collections를 사용하기 위해 ArrayList 사용
		StringBuilder sb=new StringBuilder();     // 문자열 추가 및 출력을 더 빠르게 하기 위해 StringBuilder 생성


		for(int i=0;i<N;i++) list.add(Integer.parseInt(br.readLine())); 
        Collections.sort(list);                                         
        for(int i:list) sb.append(i).append('\n');                 
        System.out.println(sb);                                         
	}
}