import java.util.*;
class Solution {
    public int solution(int[] nums) {
        
        // 포켓몬 선택 가능한 수
        int N = nums.length / 2; 
        
        Set<Integer> hash = new HashSet<>();
        // 보유한 포켓몬을 해시셋에 추가
        for(int i = 0; i < nums.length; i++){
            hash.add(nums[i]);    
        }
        
        return N < hash.size() ? N : hash.size();
    }
}