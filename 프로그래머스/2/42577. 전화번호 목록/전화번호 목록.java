import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        // 배열 정렬
        Arrays.sort(phone_book);
        
        for(int i = 0; i < phone_book.length -1; i++){
            // 접두어 확인
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        
        return true;
    }
}