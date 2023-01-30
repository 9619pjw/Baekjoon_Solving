import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i =1; i<N; i++){    //삽입 정렬 
            int tmp = arr[i];       // 현재값 저장하는 임시변수 선언
            int j = i-1;            // i-1 부터 탐색
            while((j>=0) && (tmp < arr[j])){ // 인덱스가 0 이상이고 임시변수보다 앞의 인덱스가 크면
                arr[j+1] = arr[j]; // 값을 복사함
                j -= 1;            // 탐색 계속함
            }
            arr[j+1] = tmp;       // 탐색 종료시 임시값을 넣어줌
        }

        for(int i =0; i<N; i++){
            System.out.println(arr[i]);
        }
    }
}