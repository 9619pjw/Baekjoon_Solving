import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[31];

    int cnt = 0;

    for(int i = 1; i<=28; i++){
      int n = sc.nextInt();
      arr[n] = 1;
    }
    for(int i = 1; i<arr.length; i++){
      if(arr[i] == 0)
        System.out.println(i);
    }
  }
}