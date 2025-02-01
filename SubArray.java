package Arrays_Programs;
import java.util.Scanner;
public class SubArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt(); 
	        }
	        System.out.println("All possible subarrays:");
	        for (int i = 0; i < n; i++) { 
	            for (int j = i; j < n; j++) { 
	                for (int k = i; k <= j; k++) { 
	                    System.out.print(arr[k] + " ");
	                }
	                System.out.println(); 
	            }
	        }
	    }
	}
