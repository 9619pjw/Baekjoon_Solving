import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 시
        int b = sc.nextInt(); // 분
        int c = sc.nextInt(); // 초

        int d = sc.nextInt(); // 입력 초

        int aa, bb, cc;

        cc = (c+d) %60;
        b += (c+d) /60;
        bb = b %60;
        a += b/60;
        aa = a%24;
        System.out.println(aa+" "+bb+" "+cc);

    }
}