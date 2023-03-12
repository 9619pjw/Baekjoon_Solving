import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());

        if (sb.toString().equals(sb.reverse().toString())) // sb와 sb를 뒤집어놓은것이 같으면 팰린드롬수
            System.out.println(1);
        else
            System.out.println(0);
        br.close();
    }
}