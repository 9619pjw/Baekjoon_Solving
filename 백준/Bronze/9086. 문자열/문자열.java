import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i =0; i<a; i++){
            String s = sc.next();
            char first = s.charAt(0);
            int lastIndex = s.length()-1;
            char last  = s.charAt(lastIndex);

            System.out.println(first +"" +last);
        }
    }
}