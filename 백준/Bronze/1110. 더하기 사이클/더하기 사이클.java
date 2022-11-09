import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int copy = N; 
		int count = 0;

		while (true) {
			N = ((N % 10) * 10) + ((N / 10 + N % 10) % 10); // T의 십의 자릿수 + T의 일의 자릿수
			count++;
			if (copy == N) {
				break;
			}
		}
		System.out.println(count);
	}
}