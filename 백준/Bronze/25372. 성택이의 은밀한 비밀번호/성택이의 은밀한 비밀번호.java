import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();
        for(int i =0; i<a; i++){
            String s = sc.nextLine();
            if(s.length()>=6 && s.length()<=9)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}