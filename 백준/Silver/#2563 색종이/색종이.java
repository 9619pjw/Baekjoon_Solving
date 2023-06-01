import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int N = sc.nextInt();                 // 색종이 개수
        int[][] square = new int[100][100];   // 가로 세로가 100인 정사각형을 배열로 표현했다.
        int cnt = 0;                          // 검정 색종이의 영역을 구해줄 변수이다
        for(int i = 0; i < N; i++) {          // 검정 색종이의 갯수이다.
            int x = sc.nextInt();             // 검정 색종이의 가로 값을 가져온다.
            int y = sc.nextInt();             // 검정 색종이의 세로 값을 가져온다.
            for(int j = x; j < x + 10; j++) { // 가로 값 +10의 영역과 세로 값+0의 영역은 모두 1로 변경한다.
                for(int k = y; k < y + 10; k++) {
                    if(square[j][k] == 1)      // 만약 이미 1이라면 continue
                        continue;
                    square[j][k] = 1;
                    ++cnt;                    // 1인 구역이 있다면 cnt++을 해줍니다.
                }
            }
        }
        System.out.println(cnt);                // cnt를 출력합니다.
    }
}
