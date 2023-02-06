import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String s[] = br.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			int z = Integer.parseInt(s[2]);

			if( x == 0 && y == 0 && z == 0) // 0 0 0 입력 시 종료
				break;
			if((x*x) + (y*y) == z*z)
				System.out.println("right");
			else if((x*x) + (z*z) == y*y)
				System.out.println("right");
			else if((z*z) + (y*y) == x*x)
				System.out.println("right");
			else 
				System.out.println("wrong");
		}
		br.close();
	}
}