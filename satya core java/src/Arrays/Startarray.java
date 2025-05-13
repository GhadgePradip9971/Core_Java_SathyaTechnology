package Arrays;
import java.util.*;

public class Startarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
 /*int a[]=new int[] {1,2,3,4,5};//initialization of array
 //int a[]= {1,2,3,4,5};  also intialize 
 int i;
 for(i=0;i<5;i++)
	 System.out.println("Index"+i+"-"+a[i]);
 */
 
		int a[]=new int[10];
		int i,n;
		System.out.println("Enter the size of an array=");
		n=sc.nextInt();
		
		System.out.println("Enter the elements if array=");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		System.out.println("array elements are=");
		for(i=0;i<n;i++)
			System.out.println("Index"+i+"-"+a[i]);

 
 
 
 
 
 
 
 
 
 
 
 
 
	}

}
