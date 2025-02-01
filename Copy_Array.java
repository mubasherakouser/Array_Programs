package com.jsp.arraysandstrings;
import java.util.Scanner;
public class copytheelementsofAintoB {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int a[] = new int[size];
        int copy[]=new int[a.length];
        System.out.println("Enter array elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<=a.length-1;i++) {
             copy[i]=a[i];
        }
        a[2]=45;
        System.out.println("displaying original array elements");
       for(int i=0;i<=a.length-1;i++) {
    	   System.out.println(a[i]);
       }
       System.out.println("copied elements");
        for(int i=0;i<=copy.length-1;i++) {
        System.out.println(copy[i]);
        }       
}
}
