import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0; i<N+1; i++){
			String s = sc.nextLine();
			String arr[] = s.split(" ");
			
			if(i>=1){
				System.out.print("Case #" + i + ": ");
				for(int j = arr.length-1; j>=0; j--){
					System.out.print(arr[j] + " ");
				}
				System.out.println();
			}
		}
	}
}