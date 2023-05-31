import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] ch = new char[5][15]; // 2차원 배열 선언
        int max = 0;

        for (int i = 0; i < ch.length; i++) {
            String str = br.readLine(); // 각 줄마다 문자열 입력받음
            if(max < str.length()) 
                max = str.length(); // 최대길이를 max에 저장

            for (int j = 0; j < str.length(); j++) {
                ch[i][j] = str.charAt(j); // 입력받은 문자열 2차원 배열에 담음
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if(ch[j][i] == '\0') 
                    continue; // 세로로 읽기위함.
                sb.append(ch[j][i]);
            }
        }
        System.out.println(sb);
    }
}