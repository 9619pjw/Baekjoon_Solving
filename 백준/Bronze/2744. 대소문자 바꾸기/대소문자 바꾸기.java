import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i =0; i<s.length(); i++){
            char a = s.charAt(i);
            if(Character.isUpperCase(a))
                System.out.print(String.valueOf(a).toLowerCase());
            else
                System.out.print(String.valueOf(a).toUpperCase());
        }
    }
}