import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Set<String> runners = new HashSet<>();
        
        // 참가자 명단 HashSet에 저장
        for (String runner : participant) {
            if (!runners.contains(runner)) {
                runners.add(runner);
            } else {
                runners.remove(runner);
            }
        }
        
        // 완주자 명단과 비교하여 명단 수정
        for (String runner: completion) {
            if (runners.contains(runner)) {
                runners.remove(runner);
            } else {
                runners.add(runner);
            }
        }
        
        for (String ans : runners) {
            return ans;
        }
        return null;
    }
}