import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 집합 S의 문자열 개수
        int M = Integer.parseInt(st.nextToken()); // 검사할 문자열 개수
        
        tNode root = new tNode(); // 루트는 비어있는 노드

        while(N > 0){ // 트라이 구현
            String text = br.readLine(); // 문자열 입력
            tNode now = root; 
            for(int i =0; i<text.length(); i++){
                char c = text.charAt(i); // text에 저장된 문자열을 쪼갬
                // 26개 알파벳의 위치를 배열 index로 나타내기 위해 -'a' 처리함
                if(now.next[c-'a'] == null){ // 다음 노드가 비어있으면
                    now.next[c-'a'] = new tNode(); // 새로 노드 생성함
                }
                now = now.next[c -'a']; // 현재 노드에 알파벳 저장
                if(i == text.length()-1) // text 끝에 도달하면
                    now.isEnd = true; // isEnd를 True로 바꿔주어 문자열의 끝임을 표시한다.
            }
            N--;
        }

        int cnt = 0;

        while(M >0){
            String text = br.readLine();
            tNode now = root;
            for(int i =0; i<text.length(); i++){
                char c = text.charAt(i);
                if(now.next[c-'a'] == null){ // 다음 노드가 공백 노드면 해당 문자열 포함 안함
                    break;
                }
                now = now.next[c-'a']; // 
                if(i == text.length() -1 && now.isEnd) // 문자열 끝까지 탐색하고 현재까지 모두 일치 시
                    cnt++; // cnt 횟수 증가
            }
            M--;
        }
        System.out.println(cnt);
        br.close();
    }
}

class tNode{
    tNode[] next = new tNode[26];
    boolean isEnd; // 문자열의 마지막 유무 표시
}