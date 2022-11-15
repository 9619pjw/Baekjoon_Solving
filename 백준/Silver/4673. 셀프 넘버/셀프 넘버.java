public class Main {
    public static int D_func(int n){
        int sum=0;
        sum=(n%10000/1000)+(n%1000/100)+(n%100/10)+(n%10/1)+n;
        return sum;
    }

    public static void main(String[] args){
        for(int i=1; i<10000; i++){
            for(int j=1; j<=i;j++){
                if(i==D_func(j)){
                    break;
                }else if(i==j) {
                    System.out.println(i);
                }
            }
        }
    }
}

