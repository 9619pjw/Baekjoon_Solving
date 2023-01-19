import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a[] = new int[26]; // 알파벳 사용횟수 저장하는 배열
		
        for(int i = 0 ; i<s.length(); i++){
			if(s.charAt(i) >= 97 )  // 소문자 입력일 때
				a[s.charAt(i) - 97]++;
			else                    // 대문자 입력일 때
				a[s.charAt(i) - 65]++;
		}
        int max = 0; // 가장 많이 나온 알파벳의 개수 저장됨
		int cnt = 0; // max의 개수, 1 이상일 때는 "?" 출력하게 만든다.
		for(int i =0; i<a.length; i++){     // 배열에서 가장 많이 나온 알파벳의 개수를 max에 저장
			if(max < a[i])
				max = a[i];
		}

		for(int i = 0; i<a.length; i++){
			if(max == a[i])             // max와 알파벳의 개수가 같으면 1증가
				cnt++;  
		}

		for(int i =0; i<a.length; i++){
			if(max == a[i] && cnt == 1)
				System.out.println((char)(i+'A'));
			else if (max == a[i] && cnt > 1){
				System.out.println("?");
				break;
			}
		}
	}
}
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //a = 97 A = 65 0 = 48
        String s = sc.next();
        String ch = s.toUpperCase();
        int a[] = new int[26];

        int max = 0;
        int count = 0;
        char cha = 'A';
        for(int i = 0; i<ch.length(); i++){
            for(int j = 0; j<a.length; j++)
                if(ch.charAt(i)-65 == j)
                    a[j]++; 
        }
        for(int j =0; j<a.length;j++)
            max = Math.max(a[j], max);
        for(int j=0; j<a.length;j++){
            if(max == a[j])         
                count++; 
        }
        for(int j =0; j<a.length; j++){
            if(max == a[j] && count == 1)
                System.out.println((char)(cha+j));
            else if(max == a[j] && 1 < count){
                System.out.println("?");
                break;
            }
        }
    }
}
*/
