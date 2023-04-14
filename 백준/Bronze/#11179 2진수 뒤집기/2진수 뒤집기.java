import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        // Integer.toBinaryString() : 2진수 문자열로 변환
        String temp = Integer.toBinaryString(N); // 2진수 문자열로 변환함
        sb.append(temp);
        sb.reverse(); // 뒤집음

        System.out.print(Integer.parseInt(sb.toString(), 2));// 2진수 문자열을 10진수 정수로 변환
    }
}