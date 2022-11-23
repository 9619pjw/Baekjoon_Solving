import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for(int i = 0; i<a; i++){
            int b = sc.nextInt();
            String c = sc.next();
            String str ="";
            for(int j =0; j<c.length();j++){
                for(int k =0; k<b;k++){
                    System.out.print(c.charAt(j));
                }
            }
            System.out.println();
        }
    }
}