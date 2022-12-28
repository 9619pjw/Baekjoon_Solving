import java.util.Scanner;

class Main{
    static int facto(int n){
        if(n>0)
            return n*facto(n-1);
        else
            return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(facto(a));
    }
}