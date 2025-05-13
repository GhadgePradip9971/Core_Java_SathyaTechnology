package Arrays;
import java.util.*;

public class Maximumoccurance {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		
		int a[]=new int[20];
		int i,j,n,max_ele=0,max_count=0,count=0;

		System.out.println("enter the size of array=");
		n=sc.nextInt();
		
		System.out.println("enter the array elements=");
		for(i=0;i<n;i++) 
		a[i]=sc.nextInt();
		
		for(i=0;i<n;i++) {
			count=1;
			for(j=i+1;j<n;j++) {
				if(a[i]==a[j])
				{
					count++;
				}
			}
			
		if(count>max_count)
		{
			max_count=count;
			max_ele=a[i];
		}
			
		}
		
		System.out.println("Maximum occuring element a="+max_ele);
		
		
		  
	}

}
