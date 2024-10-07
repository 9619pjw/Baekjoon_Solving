import java.util.*;

class Solution {
    boolean solution(String s) {
        
        if(s.charAt(0) == ')') return false;
        
        Stack<Character> st = new Stack<>();
        
        try{
            for(char c : s.toCharArray()){
                if(c == '(')
                    st.push(c);
                else if (c == ')')
                    st.pop();
            }
        }catch (Exception e){
            return false;
        }
        
        return st.size() == 0 ? true : false;
    }
}