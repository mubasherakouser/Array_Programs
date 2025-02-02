import java.util.Scanner;
class Arrays_P{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Elements..");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter Elements : ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(isPrime(a[i])){
				System.out.print(a[i]+"  ");
			}
		}
	}
	static boolean isPrime(int n){
		if(n<=1)
			return false;
		else 
		 for(int i=2;i<=n/2;i++)
		 {
			 if(n%i==0)
				 return false;
		 }
		 return true;
	 }
}
