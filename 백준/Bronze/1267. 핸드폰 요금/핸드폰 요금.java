import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a[] = new int[N];
        int Yon = 0;
        int Min = 0;
        for(int i =0; i<N; i++){
            a[i] = sc.nextInt(); // 배열에 문자 입력받음
            Yon += ((a[i]/30) + 1) * 10;
            Min += ((a[i]/60) + 1) * 15;
        }

       
        if(Yon > Min){
            System.out.println("M " + Min);
        }else if(Min > Yon){
            System.out.println("Y " + Yon);
        }else if (Min == Yon){
            System.out.println("Y M " + Yon);
        }
    }
}