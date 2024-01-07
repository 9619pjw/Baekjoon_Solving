import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Set set = new TreeSet(Comparator.reverseOrder()); // 사전 역순 출력

      int N = Integer.parseInt(br.readLine());

      for(int i = 0; i < N; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        String name = st.nextToken();
        String stat = st.nextToken();
        
        if(stat.equals("enter"))
          set.add(name);
        else if (stat.equals("leave")){
          if(set.contains(name))
            set.remove(name);
        }
      }
      br.close();

      Iterator<String> it = set.iterator();

      while(it.hasNext()){
        System.out.println(it.next());
      }
    }
}