import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] time = br.readLine().split(" ");

		// 1. 윤달인지 먼저 판단
		int year = Integer.parseInt(time[2]);
		boolean yearCheck = false;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			yearCheck = true;
		}

		// 2. 무슨 달인지 확인
		String month = time[0];
		int mon = 0;
		switch (month) {
		case "January":
			mon = 1;
			break;
		case "February":
			mon = 2;
			break;
		case "March":
			mon = 3;
			break;
		case "April":
			mon = 4;
			break;
		case "May":
			mon = 5;
			break;
		case "June":
			mon = 6;
			break;
		case "July":
			mon = 7;
			break;
		case "August":
			mon = 8;
			break;
		case "September":
			mon = 9;
			break;
		case "October":
			mon = 10;
			break;
		case "November":
			mon = 11;
			break;
		case "December":
			mon = 12;
			break;
		}

		// 3. 날짜 확인
		int days[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int day = Integer.parseInt(time[1].split(",")[0]);
		int dayCnt = 0;
		for (int i = 1; i < mon; i++) {
			// 3-1. 윤달이라면?
			if (yearCheck && i == 2) {
				dayCnt += 29;
				continue;
			}
			dayCnt += days[i];

		}
		dayCnt += day;

		// 4. 시간
		int hour = 60 * Integer.parseInt(time[3].split(":")[0]);
		int min = Integer.parseInt(time[3].split(":")[1]);
		int timeHM = hour + min;

		// 5. 날짜를 시간으로 환산하기.
		int timeTohour = 60 * 24 * (dayCnt - 1) + timeHM;

		// 6. 윤달일때 아닐때 차이
		int totalYear = 0;
		if (yearCheck) {
			totalYear = 366 * 60 * 24;
		} else {
			totalYear = 365 * 60 * 24;
		}
		System.out.println((double) ((double) timeTohour * 100 / (double) totalYear));
        br.close();
	}
}