import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String>[] sets = new HashSet[501];
        for (int i = 0; i <= 500; i++) {
            sets[i] = new HashSet<>(); // 집합 s는 중복허용 안함
        }
        while (N-->0) {
            String tmp = br.readLine(); // N개의 문자열 입력
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < tmp.length(); i++) {
                sb.append(tmp.charAt(i));
                sets[sb.length()].add(sb.toString()); // sets에 추가
            }
        }
        int cnt = 0; // 접두사 횟수
        while (M-->0) {
            String tmp = br.readLine(); // M개의 문자열 입력
            if (sets[tmp.length()].contains(tmp)) { // sets에 접두사 포함됐을 경우
                cnt++; // 횟수 증가
            }
        }
        System.out.println(cnt);
    }
}