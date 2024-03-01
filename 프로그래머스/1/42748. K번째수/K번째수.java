import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            int ed = commands[i][1];
            int st = commands[i][0];

            int[] tmp = new int[ed - st + 1];
            
            for(int j = 0; j <= ed-st; j++){
               tmp[j] = array[j + st -1];
            }
            Arrays.sort(tmp);
            
            answer[i] = tmp[commands[i][2]-1];
        }
        return answer;
    }
}