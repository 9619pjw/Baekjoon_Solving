import java.io.*;
import java.util.*;

class Main { // 알고리즘 수업 - 너비 우선 탐색 3
	static ArrayList<ArrayList<Integer>> arr;
	static int d[];

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(bf.readLine());

		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int r=Integer.parseInt(st.nextToken())-1;

		arr=new ArrayList<>();
		d=new int[n];

		for(int i=0; i<n; i++) {
			arr.add(new ArrayList<>());
			d[i]=-1;
		}

		for(int i=0; i<m; i++) {
			st=new StringTokenizer(bf.readLine());
			int a=Integer.parseInt(st.nextToken())-1;
			int b=Integer.parseInt(st.nextToken())-1;
			arr.get(a).add(b);
			arr.get(b).add(a);
		}

		d[r]=0;
		bfs(r);

		for(int i=0; i<n; i++) {
			bw.write(d[i]+"\n");
		}
		bw.flush();
	}

	private static void bfs(int r) {
		Queue<Integer>queue=new LinkedList<>();
		queue.add(r);

		while(!queue.isEmpty()) {
			int num=queue.poll();
			for(int i=0; i<arr.get(num).size(); i++) {
				int temp=arr.get(num).get(i);
				if(d[temp]==-1){
					d[temp]=d[num]+1;
					queue.add(temp);
				}
			}
		}
	}
}