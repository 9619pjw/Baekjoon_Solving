import java.util.*;
class Solution {
    public int solution(String dirs) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        int n = dirs.length();
        dirs += dirs;
        int answer = 0;
        
        A:for(int i = 0; i < n; i++) {
            Stack<Character> st = new Stack<>();

            for(int j = i; j < i + n; j++) {
                char c = dirs.charAt(j);

                if(!map.containsKey(c)){
                    st.push(c);
                }
                else{
                    if(st.isEmpty() || !st.pop().equals(map.get(c))) {
                        continue A;
                    }
                }
            }
            if(st.isEmpty())
                answer++;
        }
        
        return answer;
        
    }
}
