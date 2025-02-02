class Arrays_P{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of elements : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Elements : ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++){
			if(isArmStrong(a[i])){
				sum=sum+a[i];
			}
		}
		System.out.println("Sum : "+sum);
	}
	static boolean isArmStrong(int n){
		int cd=countDigits(n);
		int sum=0,temp=n;
		while(n>0){
			int rem=n%10;
			int pow=(int)Math.pow(rem,cd);
			sum=sum+pow;
			n=n/10;
		}
		return sum==temp;
	}
	static int countDigits(int n){
		int count=0;
		while(n>0){
			int rem=n%10;
			count++;
			n=n/10;
		}
		return count;
	}
}
