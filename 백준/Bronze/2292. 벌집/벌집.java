import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int num = 1;
		int count = 1;
		while (num < n) {
			num +=6 * count;	
			count++;
		}
		System.out.println(count);
	}
}