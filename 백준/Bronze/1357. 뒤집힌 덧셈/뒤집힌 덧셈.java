import java.util.Scanner;

class Main{
	public static int Rev(int num){
		int result = 0;

		while(num > 0){ // num이 0보다 작아질때까지 아래 연산 반복하여 숫자를 거꾸로 정렬
			result = result * 10 + num %10; // 10으로 나눈 나머지를 더해줌
			num /= 10;                      // num을 10으로 나눔
		}
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(Rev(Rev(a) + Rev(b)));
	}
}