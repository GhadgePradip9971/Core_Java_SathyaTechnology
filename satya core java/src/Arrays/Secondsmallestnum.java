package Arrays;

import java.util.*;

public class Secondsmallestnum extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int smallest,ssmallest,n,i;
		int a[]=new int[10];
		System.out.println("Enter the size of array");
		n=sc.nextInt();
		System.out.println("Enter the array element");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		smallest=a[0];
		
		for(i=0;i<n;i++) {
			if(a[i]<smallest)
				smallest=a[i];
		}
		ssmallest=Integer.MAX_VALUE;
		
		for(i=0;i<n;i++) {
			if(a[i]<ssmallest&&a[i]!=smallest)
				ssmallest=a[i];
			
		}
		System.out.println("smallest number="+smallest);
		System.out.println("smallest number="+ssmallest);
	}
}


