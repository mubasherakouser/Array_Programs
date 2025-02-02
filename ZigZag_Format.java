import java.util.Arrays;
import java.util.Scanner;
class Arrays_P{
	public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
      System.out.println("Enter size1 : ");
		int n1=sc.nextInt();
		System.out.println("Enter Array1 Elements : ");
		int a[]=new int[n1];
		for(int i=0;i<=a.length-1;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter size2 : ");
		int n2=sc.nextInt();
		System.out.println("Enter Array2 Elements : ");
		int b[]=new int[n2];
		for(int i=0;i<=b.length-1;i++){
			b[i]=sc.nextInt();
		}
		int[] newarr=zigZag(a,b);
		System.out.println(Arrays.toString(newarr));
	}
	static int[] zigZag(int a[],int b[]){
		int in=0;
		int c[]=new int[a.length+b.length];
		for(int i=0;i<=c.length-1/2;i++){
			if(i<=a.length-1){
				c[in]=a[i];
				in++;
			}
			if(i<=b.length-1){
				c[in]=b[i];
				in++;
			}
		}
	return c;
	}
}
