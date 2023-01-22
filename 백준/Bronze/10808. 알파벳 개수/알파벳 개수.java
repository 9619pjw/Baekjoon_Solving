import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		int a[] = new int[26];
		for(int i = 0; i<s.length(); i++){
			for(int j =0; j<a.length; j++){
				if(s.charAt(i) - 97 == j)
					a[j]++;
			}
		}
		for(int j =0; j<a.length; j++){
			System.out.print(a[j] + " ");
		}
	}
}