import java.util.Scanner;

class Main{

	public static int Rev(int num){ // 입력된 숫자 역순으로 정렬 
		int result = 0;
		while (num > 0){
			result = result * 10 + num % 10; 
			num /= 10;
		}

		return result;
	} 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int at = Rev(a);
		int bt = Rev(b);

		if(at > bt)
			System.out.println(at);
		else
			System.out.println(bt);
	}
}