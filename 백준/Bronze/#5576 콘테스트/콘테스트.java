import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] W = new int[10];
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < W.length; i++) {
			W[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(W);
		for (int i = W.length - 1; i >= 7; i--) {
			sum += W[i];
		}
		int[] K = new int[10];
		for (int i = 0; i < K.length; i++) {
			K[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(K);
		for (int i = K.length - 1; i >= 7; i--) {
			sum2 += K[i];
		}

		System.out.println(sum + " " + sum2);
		br.close();
	}
}