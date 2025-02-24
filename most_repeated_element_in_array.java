package Arrays_Programs;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class most_repeated_element_in_array {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements : ");
		for(int i=0;i<=a.length-1;i++){
				a[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> m=new HashMap();
		for(int i=0;i<=a.length-1;i++) {
			if(m.containsKey(a[i])) {
				m.put(a[i], m.get(a[i])+1);
			}
			else {
				m.put(a[i],1);
			}
		}
		int maxcount=0,max=0;
		for(Map.Entry<Integer,Integer> m1:m.entrySet()) {
			if(m1.getValue()>maxcount) {
				maxcount=m1.getValue();
				max=m1.getKey();
			}
		}
		System.out.println("Most Repeated Element : "+max);		
	}		
	}


