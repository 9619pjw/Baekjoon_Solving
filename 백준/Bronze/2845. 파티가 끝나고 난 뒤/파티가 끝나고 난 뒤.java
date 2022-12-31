import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i =0; i<5; i++){
            int news = sc.nextInt();
            System.out.print(news - a*b + " ");
        }
    }
}