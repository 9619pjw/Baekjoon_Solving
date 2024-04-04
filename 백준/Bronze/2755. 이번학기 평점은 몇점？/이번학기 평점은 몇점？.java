import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 과목 수 입력
        int N = sc.nextInt();
        sc.nextLine(); // 숫자 입력 후 남은 줄바꿈 문자 제거

        // 성적에 따른 점수 매핑
        double[] scores = new double[N];
        int totalCredits = 0;
        double totalScore = 0.0;

        for (int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            int credit = Integer.parseInt(input[1]);
            double grade = getGrade(input[2]);
            totalCredits += credit;
            totalScore += grade * credit;
        }

        // 평균 평점 계산 및 출력
        System.out.printf("%.2f", totalScore / totalCredits);
    }

    // 성적을 숫자로 변환
    public static double getGrade(String grade) {
        switch (grade) {
            case "A+": return 4.3;
            case "A0": return 4.0;
            case "A-": return 3.7;
            case "B+": return 3.3;
            case "B0": return 3.0;
            case "B-": return 2.7;
            case "C+": return 2.3;
            case "C0": return 2.0;
            case "C-": return 1.7;
            case "D+": return 1.3;
            case "D0": return 1.0;
            case "D-": return 0.7;
            case "F":  return 0.0;
            default: return 0.0;
        }
    }
}