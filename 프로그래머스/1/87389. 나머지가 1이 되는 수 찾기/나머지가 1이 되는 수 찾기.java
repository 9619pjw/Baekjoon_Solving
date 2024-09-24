class Solution {
    public int solution(int n) {
        int answer = 2;
        
        while(answer <= n){
            if(n % answer != 1){
                answer++;
            } else{
                break;
            }
        }
        return answer;
    }
}