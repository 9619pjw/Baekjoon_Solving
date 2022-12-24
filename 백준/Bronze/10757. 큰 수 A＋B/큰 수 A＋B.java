import java.math.BigInteger;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String InputData = sc.nextLine();

       String[] arr = InputData.split(" ");
       BigInteger A = new BigInteger(arr[0]);
       BigInteger B = new BigInteger(arr[1]);

       A = A.add(B);

       System.out.println(A.toString());
    }
}