import java.util.Arrays;
import java.util.Scanner;
public class Arrays_P{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter size:");
    int size = sc.nextInt();
    int a[] = new int[size];
    System.out.println("Enter array elements:");
    for (int i = 0; i <=a.length-1; i++) {
        a[i] = sc.nextInt();
    }
    int temp;
    int i=0,j=a.length-1;
    while(i<j) {
    	temp=a[i];
    	a[i]=a[j];
    	a[j]=temp;
    	i++;
    	j--;
    }
    System.out.println(Arrays.toString(a));
}
}
