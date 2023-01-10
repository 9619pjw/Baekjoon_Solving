import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[] = new int[a];
		int cnt = 1;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int tmp = arr[a-1];
		for(int i = a-1; i>= 0; i--) {
			if(arr[i] > tmp) {
				tmp = arr[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}