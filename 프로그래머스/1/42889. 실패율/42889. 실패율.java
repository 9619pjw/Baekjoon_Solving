import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5,new int[]{2,1,2,6,2,4,3,3})));
        System.out.println(Arrays.toString(solution(4,new int[]{4,4,4,4,4})));    
    }
    public int[] solution(int N, int[] arr) {
        double total = arr.length; // 총 인원수
        
        // 스테이지에 도달한 인원 수 담는 배열
        int[] challenger = new int[N+2];
        for(int stage : arr){
            challenger[stage] += 1;
        }
        
        // 실패율 담는 Map
        Map<Integer, Double> fails = new HashMap<>();

        for(int i = 1; i <= N; i++) {
            if(challenger[i] == 0) { 
                fails.put(i, 0.0);
            }
            else {
                fails.put(i, challenger[i] / total);
                total -= challenger[i];
            }
        }
      
        int[] answer = new int[N];
        // 실패율 내림차순 정렬
        answer = fails.entrySet().stream().sorted((o1, o2) -> 
            o1.getValue().equals(o2.getValue()) ? Integer.compare(o1.getKey(), 
            o2.getKey()) : Double.compare(o2.getValue(),
            o1.getValue())).mapToInt(Map.Entry::getKey).toArray();
        return answer;
    }
}
