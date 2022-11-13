import java.util.Scanner;

class Main{
    public static void main(String[] string){
        Scanner s = new Scanner(System.in);

        int max = 0;
        int count = 0;

        int [] arr = new int[9];

        for(int i =0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                count = i+1;
            }
        }

        System.out.println(max);
        System.out.println(count);
    }
}