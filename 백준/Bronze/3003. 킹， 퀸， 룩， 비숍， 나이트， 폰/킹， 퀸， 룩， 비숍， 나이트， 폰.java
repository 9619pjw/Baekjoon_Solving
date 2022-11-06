import java.util.Scanner;
public class Main
 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int k=1;
        int q=1; 
        int l=2;
        int b=2;
        int n=2;
        int p=8;

        k = k-sc.nextInt();
        q = q-sc.nextInt();
        l = l-sc.nextInt();
        b = b-sc.nextInt();
        n = n-sc.nextInt();
        p = p-sc.nextInt();
        System.out.print(k+" "+q+" "+l+" "+b+" "+n+" "+p);
    }
}
