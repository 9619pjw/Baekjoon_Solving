import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int cnt = 0; // 중복되는 사람의 수

        ArrayList<String> noHearSee = new ArrayList<>(); // 듣도보도 못한 사람 하나의 배열 리스트에 담음
        ArrayList<String> no = new ArrayList<>(); // 중복되는 사람을 담는 배열 리스트

        for(int i =0; i<N+M; i++){
            noHearSee.add(sc.next());   // 한번에 입력받음
        }

        Collections.sort(noHearSee); // 입력받은 사람들을 정렬함
        for(int i=0; i<N+M-1; i++){// 정렬된 배열 요소를 비교하여 같은 이름이 있나 검사함
            if(noHearSee.get(i).equals(noHearSee.get(i+1))){ 
                cnt++; 
                no.add(noHearSee.get(i)); // 중복 횟수 증가 및 no 배열리스트에 추가함
            }
        }

        System.out.println(cnt); // 중복 횟수 출력
        for(int i =0; i<no.size(); i++){
            System.out.println(no.get(i));
        }
    }
}