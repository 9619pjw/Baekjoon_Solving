import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine()); // 테스트 케이스 입력
        for(int i =0; i<N; i++){
            String[] s = br.readLine().split(" "); // 동물들의 울음소리 녹음함. 공백문자로 구분한다.

            String record; // 동물들의 울음소리를 적음

            while(!(record = br.readLine()).equals("what does the fox say?")){ // 마지막 문장 입력되기 전까지 반복함
                String[] s2 = record.split(" "); //동물들의 울음소리 공백문자로 나누어 저장

                for(int j = 0; j < s.length; j++){
                    if(s2[2].equals(s[j])) // 동물들의 울음소리와 녹음된 소리가 같으면
                        s[j] = "";      // 녹음된 동물의 소리를 공백으로 변경
                }
            }

            for(int j =0; j<s.length; j++){ // 녹음된 소리 출력
                if(!s[j].equals("")) // 공백문자가 아닌 문자 (=여우 울음소리) 출력함
                    bw.write(s[j] + " ");
            }
        }
        bw.flush();

        bw.close();
        br.close();
    }
}