import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int C = sc.nextInt();
		int D = sc.nextInt();
		sc.close();

		System.out.println(Math.min(A + D, B + C));

	}

}