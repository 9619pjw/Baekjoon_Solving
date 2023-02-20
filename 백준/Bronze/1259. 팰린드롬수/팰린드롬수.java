import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        while(true){

            String s = br.readLine();
            if(s.equals("0")) break;

            boolean pal = true;
            int front = s.length() /2;
            int length = s.length();

            for(int i =0; i<front; i++){
                if(s.charAt(length-(i+1)) != s.charAt(i)){
                    pal =false;
                }
            }

            if(pal)
                System.out.println("yes");
            else
                System.out.println("no");

        }
        br.close();
    }    
}
