import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int arr[] = new int[3];
    	for(int i=0; i<arr.length; i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	int i,j,min,index, temp;
    	for(i=0; i<arr.length; i++) {
    		min = 999;
    		if(min > arr[i]) {
    			min = arr[i];
    			index = i;
    		}
    		for(j=0; j<arr.length; j++) {
    			if(arr[j] > arr[i]) {
    				temp = arr[i];
    				arr[i] = arr[j];
    				arr[j] = temp;
    			}
    		}
    	}
    	for(int k=0; k<arr.length; k++) {
    		System.out.print(arr[k] + " ");
    	}
    	
    }
}