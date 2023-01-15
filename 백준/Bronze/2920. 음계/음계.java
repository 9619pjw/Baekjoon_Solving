import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int [] arr = new int[8];
		
		for(int i =0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		String s = "";
		for(int i = 0; i<arr.length-1; i++){
			if(arr[i] + 1 == arr[i+1]){
				s = "ascending";
			}	
			else if (arr[i] -1 == arr[i+1]){
				s = "descending";
			}
			else{
				s = "mixed";
				break;
			}
		}
		System.out.println(s);
	}
}
