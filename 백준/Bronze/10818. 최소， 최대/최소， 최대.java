import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
        int Max = -1000000;
        int min = 1000000;
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
           if(a[i]>Max)
                Max = a[i];
           if(min>a[i])
                min = a[i];
        }
        System.out.println(min+ " " +Max);
	}
}