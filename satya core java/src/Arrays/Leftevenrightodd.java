package Arrays;
import java.util.*;
public class Leftevenrightodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i,n,min,max,temp;
		
		int a[]=new int[20];
		
		System.out.println("enter the size of array=");
		n=sc.nextInt();
		
		System.out.println("enter the array elements=");
		for(i=0;i<n;i++) 
		a[i]=sc.nextInt();
		
		
		
		
		min=0;
		max=n-1;
		while(min<max)
		{
			while(a[min]%2==0 && min<max)
				min++;
			while(a[max]%2==1 && min<max)
				max--;
			
			if(min<max)
			{
				temp=a[min];
				a[min]=a[max];
				a[max]=temp;
				
			}
			
			min++;
			max--;
		}
		System.out.println(a[i]);
		
		
		
	}

}

