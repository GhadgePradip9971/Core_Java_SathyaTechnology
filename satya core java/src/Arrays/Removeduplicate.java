package Arrays;
import java.util.*;
public class Removeduplicate {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);

int a[]=new int[20];
int n,i,j,k;
System.out.println("Enter the size of array=");
n=sc.nextInt();
System.out.println("Enter  array elements=");
for(i=0;i<n;i++)
	a[i]=sc.nextInt();

for(i=0;i<n;i++) {
	for(j=i+1;j<n;j++)
	{
		if(a[i]==a[j])
		{
			for(k=j;k<n-1;k++)
				a[k]=a[k+1];
			j--;
			k--;
		}
	}
}
	
	
	for(i=0;i<n;i++) {
		System.out.print(a[i]+ " ");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
