import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a[] = new int[5];
		int sum = 0;
		int avg;
		for(int i =0; i<a.length; i++){
			a[i] = sc.nextInt();
			if(a[i] <40)
				a[i] = 40;
			sum += a[i];
		}
		avg = sum / 5;
		System.out.println(avg);
	}
}