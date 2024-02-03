import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name = br.readLine();
		int nameLength = name.length();
        //연두 이름 기준 L, O, V, E 개수
		int L = nameLength - name.replaceAll("L", "").length();
		int O = nameLength - name.replaceAll("O", "").length();
		int V = nameLength - name.replaceAll("V", "").length();
		int E = nameLength - name.replaceAll("E", "").length();
		
        //팀 개수
		int t = Integer.parseInt(br.readLine());
		
        //확률의 가장 작은 숫자 0과 팀 이름의 마지막인 ZZZZZZZZZZZZZZZZZZZZ로 설정
		int max = 0;
		String result = "ZZZZZZZZZZZZZZZZZZZZ";
		
        //팀 명 하나씩 꺼내면서 확률 측정하기
		for (int i = 0; i < t; i++) {
			String team = br.readLine();
			int teamLength = team.length();
			int tL = teamLength - team.replaceAll("L", "").length();
			int tO = teamLength - team.replaceAll("O", "").length();
			int tV = teamLength - team.replaceAll("V", "").length();
			int tE = teamLength - team.replaceAll("E", "").length();
			
			int total = sum(L+tL, O+tO, V+tV, E+tE);
			
			if (max < total) {
				max = total;
				result = team;
			} else if (max == total) {
				if (result.compareTo(team) > 0) {
					result = team;
				}
			}
		}
		
		System.out.println(result);
	}
	
	public static int sum(int l, int o, int v, int e) {
		return ((l+o) * (l+v) * (l+e) * (o+v) * (o+e) * (v+e)) % 100;
	}
}