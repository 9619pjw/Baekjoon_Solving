import java.util.*;

class Solution {
    private static boolean isValidMove(int x, int y) {
        return 0 <= x && x < 11 && 0 <= y && y < 11;
    }

    private static final HashMap<Character, int[]> location = new HashMap<>();
    
    private static void initLocation() {
        location.put('U', new int[]{0, 1});
        location.put('D', new int[]{0, -1});
        location.put('L', new int[]{-1, 0});
        location.put('R', new int[]{1, 0});
    }

    public static int solution(String dirs) {
        
        initLocation();
        int x = 5;
        int y = 5;

        // 중복 경로는 1개로 처리하기 위해 HashSet 사용
        HashSet<String> answer = new HashSet<>();

        for(int i = 0; i < dirs.length(); i++) {
            int[] offset = location.get(dirs.charAt(i));
            int nx = x + offset[0];
            int ny = y + offset[1];

            // 유효하지 않은 좌표는 무시
            if(!isValidMove(nx, ny)) {
                continue;
            }

            // 경로 하나 추가 시 역방향 경로도 추가해줌
            answer.add(x + "," + y + "," + nx + "," + ny);
            answer.add(nx + "," + ny + "," + x + "," + y);

            // 좌표 업데이트
            x = nx;
            y = ny;
        }

        return answer.size() / 2;
    }
}
