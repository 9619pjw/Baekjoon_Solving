import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double array[] = new double[sc.nextInt()];
    
    double max = 0;
    double sum = 0;
    
    for(int i=0; i<array.length; i++){
      array[i] = sc.nextInt();
      if(array[i]>max)
        max = array[i];
    }
    for(int i = 0; i<array.length; i++){
      sum += (array[i]/max)*100; 
    }
    double avg = 0;
    avg = sum / array.length;
    System.out.println(avg);
  }
}