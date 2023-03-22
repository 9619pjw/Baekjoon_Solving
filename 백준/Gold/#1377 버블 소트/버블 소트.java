// 버블 정렬의 swap이 한번도 일어나지 않은 루프를 찾는 문제. 안쪽 for문에서 swap이 발생되지 않으면 정렬끝남.
// 버블 정렬은 시간초과 발생. 안쪽 for문이 몇번 수행되는지 구하는 다른 아이디어 필요함
// 데이터의 정렬 전 index와 정렬 후 index를 비교해 왼쪽으로 가장 많이 이동한 값을 찾으면 됨
import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        mData[] A = new mData[N]; // mData 클래스를 데이터로 담는 배열 A
        
        for(int i = 0; i<N; i++){
            A[i] = new mData(Integer.parseInt(br.readLine()), i);
        }
        Arrays.sort(A);
        int max = 0;
        for(int i =0; i<N; i++){
            if(max < A[i].index - i) // 정렬 전 index - 정렬 후 index 계산의 최댓값을 찾아 저장함
                max = A[i].index - i;  
        }
        System.out.println(max+1); // swap이 일어나지 않는 반복문이 한번 더 실행되므로 최댓값에 +1
        br.close();
    }
}

class mData implements Comparable<mData>{ // index와 value를 가지는 클래스
    int value;
    int index;

    public mData(int value, int index){
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(mData o){
        return this.value - o.value; // value 기준 오름차순 정렬
    }
}