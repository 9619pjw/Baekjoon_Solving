import java.util.*;

public class Main {
	
	public static void countcolumn(int M,String line, List columnindex){
     //columnindex에 X가 존재하는 열의 index를 추가하는 함수
		for (int j = 0; j < M; j++) {
			if (line.charAt(j) == 'X') {
				if(!columnindex.contains(j)) { //index번호가 중복되지 않도록 함
				columnindex.add(j);}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 성의 세로 크기 
		int M = sc.nextInt(); // 성의 가로 크기 
		String line[] = new String[N];
		List<Integer> rowindex = new ArrayList<>(); //X가 존재하는 행(line)의 index
		List<Integer> columnindex=new ArrayList<>(); //X가 존재하는 열의 index
		
		for(int k=0;k<N;k++) { //입력받고 해당 line에 X가 존재한다면 rowindex에 index값 저장
			line[k]=sc.next();
			if(line[k].contains("X")) rowindex.add(k);
		}

		if(rowindex.size()==N) { //모든 행에 X가 존재하는 경우 
			for(int i=0;i<N;i++) {
				int count=0;
				countcolumn(M,line[i],columnindex);
			}
			System.out.println(M-columnindex.size());
		}
		
		else { //어떤 행에는 X가 존재하지 않는 경우
			for(int i=0;i<rowindex.size();i++) {
				int count=0;
				countcolumn(M,line[rowindex.get(i)],columnindex);
			}
			if(N-rowindex.size()>M-columnindex.size())  System.out.println(N-rowindex.size());
			else System.out.println(M-columnindex.size());			
		}
    }
}