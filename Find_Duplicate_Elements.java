public class Duplicate {    
   public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Elements : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Elements : ");
		for(int i=0;i<=a.length-1;i++){
			a[i]=sc.nextInt();
		}
   }
    static void findDuplicates(int[] arr) {    
        for (int i = 0; i < arr.length; i++) {    
            for (int j = i + 1; j < arr.length; j++) {    
                if (arr[i] == arr[j]) {    
                    System.out.println("Duplicate element found: " + arr[i]);    
                    break;    
                }    
            }    
        }    
    }    
}    
