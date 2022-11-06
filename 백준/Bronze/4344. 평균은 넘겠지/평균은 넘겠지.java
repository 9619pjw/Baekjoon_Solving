import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); // 줄 수
    int [] arr = new int[a];

    for(int i=0; i<a; i++){
      int b = sc.nextInt(); // 학생 수
      int [] arr2 = new int[b];
      
      double sum = 0;
      
      for(int j=0; j<b; j++){
        arr2[j] = sc.nextInt();
        sum += arr2[j];
      }
      double avg = (sum/b);
      double cnt =0;
      for(int j=0; j<b; j++){
        if(arr2[j]> avg)
          cnt++;
      }
      System.out.printf("%.3f%%\n",(cnt/b)*100);
    }
  }
}