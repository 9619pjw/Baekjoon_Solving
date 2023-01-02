import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        
        for(int i = 1; i<=N; i++){
            System.out.println(i+". "+sc.nextLine());
        }
    }
}