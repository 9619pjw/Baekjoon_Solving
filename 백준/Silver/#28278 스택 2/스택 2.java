import java.io.*;
import java.util.*;

class Main {

    static Stack<Integer> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //명령어의 수

        while(N --> 0){
            stackFunc(br.readLine());
        }

        br.close();
        System.out.println(sb);
    }

    static void stackFunc(String s){
        char c = s.charAt(0);

        switch (c){
            case '1' : stack.push(Integer.parseInt(s.substring(2))); return;
            case '2' : sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n"); return;
            case '3' : sb.append(stack.size()).append("\n"); return;
            case '4' : sb.append(stack.isEmpty() ? 1 : 0).append("\n"); return;
            case '5' : sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n"); return;
            default: break;
        }
    }
}
        