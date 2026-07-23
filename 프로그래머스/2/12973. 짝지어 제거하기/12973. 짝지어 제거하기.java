import java.util.*;

class Solution
{
    public int solution(String dirs)
    {
       Stack<Character> st = new Stack<>();

        for(int i = 0; i  < dirs.length(); i++) {
            char tmp = dirs.charAt(i);

            if(!st.isEmpty() && st.peek() == tmp) {
                st.pop();
            }
            else {
                st.push(tmp);
            }
        }

        return st.isEmpty() ? 1 :  0;
    }
}
