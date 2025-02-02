package Arrays_Programs;

import java.util.Scanner;

public class Common_Elements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array1 size : ");
		int n1=sc.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enter Array1 elements :");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter Array2 size : ");
		int n2=sc.nextInt();
		int arr2[]=new int[n2];
		System.out.println("Enter Array2 elements :");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		        System.out.print("Common elements: ");
		        for (int i = 0; i < arr1.length; i++) {
		            for (int j = 0; j < arr2.length; j++) {
		                if (arr1[i] == arr2[j]) {
		                    System.out.print(arr1[i] + " ");
		                    break; // Avoid duplicate prints
		                }
		            }
		        }
		    }
	}


