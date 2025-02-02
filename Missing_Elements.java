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
		int big=a[0],small=a[0];
		for(int i=1;i<=a.length-1;i++){
			if(a[i]>big){
				big=a[i];
			}
			if(a[i]<small){
				small=a[i];
			}
		}
		for(int i=small+1;i<big;i++){
			if(isMissing(i,a)){
				System.out.println("Missing Elements : "+i);
			}
		}
	}
	static boolean isMissing(int n,int a[]){
		for(int i=0;i<=a.length-1;i++){
			if(n==a[i]){
				return false;
			}
		}
		return true;
	}
}
