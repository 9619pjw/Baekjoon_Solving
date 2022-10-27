import java.util.Scanner;
public class Main
 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int a;//입력받을 정수의 개수
        int count = 0; // 배열에 찾는 정수가 몇개 나오는지
        a = sc.nextInt();
        int b[] = new int[a]; // 입력받은 정수만큼 배열 생성

        for(int i= 0; i<a; i++){
            b[i] = sc.nextInt();
        }

        int c = sc.nextInt();
        for(int j=0; j<a;j++){
            if(b[j] == c)
                count++;
        }

        System.out.println(count);
    }
}