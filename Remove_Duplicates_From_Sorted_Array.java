import java.util.Scanner;
public class Remove_Duplicates{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array Elements : ");
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
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
