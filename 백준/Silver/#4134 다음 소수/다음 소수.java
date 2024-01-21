import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        long n;
        for(int i=0; i<T; i++){
            n = Long.parseLong(br.readLine());
            BigInteger bigInt = new BigInteger(String.valueOf(n));
            if (bigInt.isProbablePrime(10)) {
                System.out.println(bigInt);
            }
            else {
                System.out.println(bigInt.nextProbablePrime());
            }
        }
    }
}