import java.util.Arrays;
import java.util.Scanner;
public class Arrays_P{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<=a.length-1;i++){
		 a[i]=sc.nextInt();
	}
		for(int i=0;i<=a.length-1;i++) {
		a[i]=sum(a[i]);
	}
		System.out.println(Arrays.toString(a));
	}
		static int sum(int n) {
			int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		return sum;
		}
}
