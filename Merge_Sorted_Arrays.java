package Arrays_Programs;
import java.util.Scanner;
import java.util.Arrays;
public class Merge_Sorted_Array {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter sizeof 1st array");
			int size1=sc.nextInt();
			int a[]=new int[size1];
			System.out.println("Enter array elements");
			for(int i=0;i<=a.length-1;i++){
			 a[i]=sc.nextInt();
		}
			System.out.println("enter sizeof 2ndt array");
			int size2=sc.nextInt();
			int b[]=new int[size2];
			System.out.println("Enter array elements");
			for(int i=0;i<=b.length-1;i++){
			 b[i]=sc.nextInt();
			 }
		     for(int i=0;i<=a.length-1;i++) {
		        	for(int j=i+1;j<=a.length-1;j++) {
		        		if(a[i]>a[j]) {
		        			int temp=a[i];
		        			a[i]=a[j];
		        			a[j]=temp;
		        		}
		        	}	
		        }
		        for(int i=0;i<=b.length-1;i++) {
		        	for(int j=i+1;j<=b.length-1;j++) {
		        		if(b[i]>b[j]) {
		        			int temp=b[i];
		        			b[i]=b[j];
		        			b[j]=temp;
		        		}
		        	}	
		        }
			int c[]=ismerge(a,b);
			System.out.println(Arrays.toString(c));
			}
			static int[] ismerge(int a[],int b[]) {
				int c[]=new int[a.length+b.length];
				for(int i=0;i<=a.length-1;i++) {
					c[i]=a[i];
			}
				for(int i=0;i<=b.length-1;i++) {
					c[a.length+i]=b[i];
				}
				return c;
		}
	}


