import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int x, n;
		
		int sum = 0;

		x = s.nextInt();
		n = s.nextInt();
		int a[] = new int[n]; 
		int b[] = new int[n];

		for(int i=0; i<n;i++){
			a[i] = s.nextInt();
			b[i] = s.nextInt();
			sum += a[i]*b[i];
		}

		if(x == sum)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}