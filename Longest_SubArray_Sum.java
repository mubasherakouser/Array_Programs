package Arrays_Programs;
import java.util.Scanner;
public class SubArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
            int big=0,x=0,y=0;
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt(); 
	        }
	        for (int i = 0; i < n; i++) { 
	        	int sum=0;
	            for (int j = i; j < n; j++) { 
	                sum=sum+arr[j];
	                for (int k = i; k <= j; k++) { 
	                    //System.out.print(arr[k] + " ");
	                }
	              // System.out.println(); 
	            if(big<sum) {
	            	big=sum;
	            	x=i;
	            	y=j;
	            }
	        }
	        }
	        System.out.println("Longest Sub Array : ");    
	        for(int i=x;i<=y;i++) {
	        	System.out.print(arr[i]+" ");
	        }
	        System.out.println();
	        System.out.println("Big : "+big);
	    }
}

