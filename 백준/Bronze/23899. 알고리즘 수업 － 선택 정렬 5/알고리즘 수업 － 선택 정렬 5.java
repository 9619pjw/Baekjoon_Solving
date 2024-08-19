import java.io.*;
import java.util.*;

public class Main {	
    static int n;	
    static int [] a, b;	
    public static void main(String[] args) throws Exception{		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
        n=Integer.parseInt(br.readLine());		
        a = new int [n+1];		
        b=new int[n+1];		
        int cnt=0;		
        StringTokenizer st = new StringTokenizer(br.readLine());		
        for(int i=1;i<=n;i++)			
            a[i]=Integer.parseInt(st.nextToken());		
        
        st = new StringTokenizer(br.readLine());		
        for(int i=1;i<=n;i++) {			
            b[i]=Integer.parseInt(st.nextToken());			
            if(b[i]==a[i])				
                cnt++;		
        }		
        
        if(cnt==n)			
            bw.write("1\n");		
        else			
            bw.write(selection_sort() ? "1\n" : "0\n");

        bw.flush();
        bw.close();
        br.close();
    }		
        
    public static boolean selection_sort() {		
        int i;
        
        for(int last=n;last>=2;last--) {			
            int max = 0; 
            int maxi = 0;			
            for(i = 1 ; i <= last ; i++) {				
                if(max < a[i]) {					
                    max = a[i];					
                    maxi = i;				
                }			
            }			
            if(last != maxi) {				
                int temp = a[last];				
                a[last] = a[maxi];				
                a[maxi] = temp;			
            }			

            int cnt=0;	
            
            for(i = 1; i <= n ; i++)				
                if(a[i] == b[i])					
                    cnt++;				
                else					
                    break;			
            if(cnt == n)				
                return true;	
            }		
            return false;	
        }
    }