class Arrays_P{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Elements : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Elements : ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++){
			if(isPalindrome(a[i])){
				count++;
			}
		}
		System.out.println("Number Of Palindromes : "+count);
	}
	static boolean isPalindrome(int n){
		int rev=0,temp=n;
		while(n>0){
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev==temp;
	}
}
