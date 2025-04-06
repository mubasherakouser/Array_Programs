/* Online Java Compiler and Editor */
import java.util.Scanner;
import java.util.Arrays;
public class HelloWorld{
     public static void main(String []args){
        //System.out.println("Hello, World!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array Elements : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int temp[]=new int[a.length];
        int j=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                temp[j++]=a[i];
            }
        }
        temp[j++]=a[a.length-1];
        for(int k=0;k<j;k++){
            System.out.print(temp[k]+" ");
        }
     }
}
