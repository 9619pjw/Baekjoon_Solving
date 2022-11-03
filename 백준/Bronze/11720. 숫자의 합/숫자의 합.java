import java.util.Scanner;

public class Main
{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next();
        char[] cnum = new char[a];
        cnum = s.toCharArray();

        int sum = 0;
        for(int i=0; i<cnum.length;i++){
            sum += cnum[i] - '0';
        }
    
        System.out.println(sum);
    }
}