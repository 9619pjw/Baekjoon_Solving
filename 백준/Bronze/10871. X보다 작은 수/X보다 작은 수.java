import java.util.Scanner;
public class Main
 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        for(int i = 0; i<N; i++){
            int a = sc.nextInt();
            if(a<x)
                System.out.print(a + " ");
        }
    }
}
