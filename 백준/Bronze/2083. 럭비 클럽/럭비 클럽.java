import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        while(true){
            String s = sc.next();
            int age = sc.nextInt();
            int weight = sc.nextInt();

            if(s.equals("#"))
                break;
            if(age > 17 || weight >= 80)
                System.out.println(s + " Senior");
            else
                System.out.println(s + " Junior");
        }
    }
}