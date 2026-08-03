import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer>[] stack = new Stack[board.length];

        for(int i = 0; i < stack.length; i++){
            stack[i] =  new Stack<>();
        }

        for (int i = board.length - 1; i >= 0; i--) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] != 0) {
                    stack[j].push(board[i][j]);
                }
            }
        }

        Stack<Integer> answer = new Stack<>();
        int result = 0;
        for(int i = 0; i < moves.length; i++) {
            int move = moves[i] - 1;
            
            if(!stack[move].isEmpty()){
                int doll = stack[move].pop();

                if(!answer.isEmpty() && answer.peek() == doll){
                    answer.pop();
                    result+=2;
                 
                }
                else{
                    answer.push(doll);
                }
            }
        }
        return result;
    }
}
