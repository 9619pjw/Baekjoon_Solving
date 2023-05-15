import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double sum = 0;
        double creditSum = 0;
        String str;

        while (true) {
            str = br.readLine();
            if (str == null) break;
            st = new StringTokenizer(str);

            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if (!grade.equals("P")) {
                double score = checkGrade(grade);

                creditSum += credit;
                sum += credit * score;
            }
        }
        double avg = sum / creditSum;
        System.out.println(avg);
    }

    public static double checkGrade(String grade) {
        if (grade.startsWith("A")) {
            if (grade.equals("A0")) return 4.0;
            else return 4.5;
        } else if (grade.startsWith("B")) {
            if (grade.equals("B0")) return 3.0;
            else return 3.5;
        } else if (grade.startsWith("C")) {
            if (grade.equals("C0")) return 2.0;
            else return 2.5;
        } else if (grade.startsWith("D")) {
            if (grade.equals("D0")) return 1.0;
            else return 1.5;
        } else {
            return 0;
        }
    }
}