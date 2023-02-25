import java.io.*;
import java.util.*;

class Main{
    public static void Dequeue(){

    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<Integer>();
        
        for(int i =0; i<N; i++){
            String str = br.readLine();
            String arr[] = str.split(" ");


            switch(arr[0]){
                case "push_front" :
                    q.addFirst(Integer.parseInt(arr[1]));
                    break;
                case "push_back" :
                    q.addLast(Integer.parseInt(arr[1]));
                    break;
                case "pop_front" :
                    if(q.size() != 0){
                        System.out.println(q.pollFirst());
                        break;
                    }
                    else{
                        System.out.println(-1);
                        break;
                    }
                case "pop_back" :
                    if(q.size() != 0){
                        System.out.println(q.pollLast());
                        break;
                    }
                    else{
                        System.out.println(-1);
                        break;
                    }
                case "size" :
                    System.out.println(q.size());
                    break;
                case "empty" :
                    if(q.size() == 0){
                        System.out.println(1);
                        break;
                    }
                    else{
                        System.out.println(0);
                        break;
                    }
                case "front" :
                    if(q.size() != 0){
                        System.out.println(q.peekFirst());
                        break;
                    }else{
                        System.out.println(-1);
                        break;
                    }
                case "back" :
                    if(q.size()!= 0){
                        System.out.println(q.peekLast());
                        break;
                    }else{
                        System.out.println(-1);
                        break;
                    }
            }
        }
        br.close();
    }
}