import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;

			sc.nextLine();

			String[] Arr = new String[n];
			for (int i = 0; i < n; i++) {
				Arr[i] = sc.nextLine();
			}

			String[][] sp = new String[n][n];

			for (int i = 0; i < n; i++) {
				sp[i] = Arr[i].split(" ");
			}
			num++;
			System.out.println("Group " + num);

			int cnt = 0; // cnt값이 0이면 Nobody was nasty 출력

			for (int i = 0; i < n; i++) {
				for (int j = 1; j < n; j++) {
					if (sp[i][j].equals("N"))
						cnt++;
				}
			}
			if (cnt == 0)
				System.out.println("Nobody was nasty");
			else {
				for (int i = 0; i < n; i++) {
					for (int j = 1; j < n; j++) {
						if (sp[i][j].equals("N")) {
							if (i >= j)
								System.out.println(sp[i - j][0] + " was nasty about " + sp[i][0]);
							if (i < j)
								System.out.println(sp[n - (j - i)][0] + " was nasty about " + sp[i][0]);
						}
					}
				}
			}
			System.out.println();
		}

	}

}