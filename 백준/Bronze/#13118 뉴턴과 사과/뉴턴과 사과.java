import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws Exception{

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int arr[] = new int[4];
         StringTokenizer st = new StringTokenizer(br.readLine());
      
         for(int i = 0; i < 4; i++){
             arr[i] = Integer.parseInt(st.nextToken());
         }
          
      
         st = new StringTokenizer(br.readLine());
      
         int x = Integer.parseInt(st.nextToken());
         int y = Integer.parseInt(st.nextToken());
         int r = Integer.parseInt(st.nextToken());
      
         br.close();
              
         boolean isCrash = false;
      
        for(int i =0; i< 4; i++){
            if(arr[i] == x){
              System.out.println(i+1);
              isCrash = true;
            }
        }
      
        if(isCrash == false)
           System.out.println(0);
     }
}