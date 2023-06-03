import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 파일 이름의 개수

        char[] s = br.readLine().toCharArray(); // 비교 기준 담는 문자배열
        for (int i = 0; i < N - 1; i++) {
            char[] fileName = br.readLine().toCharArray(); // 문자배열에 파일 이름 입력받음
            for (int j = 0; j < s.length; j++) {
                if(s[j] != fileName[j]) s[j] = '?'; // 비교할때 다른 문자배열 발견시 ?로 변경
            }
        }
        System.out.println(s);
        br.close();
    }
}