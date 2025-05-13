package Arrays;
import java.util.*;

public class Secoundlargestsmallest2 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	int a[]=new int[20];
	int i, n=0,largest,slargest;
	
	System.out.println("Enter  size of array =");
	n=sc.nextInt();
	System.out.println("Enter array element=");
	{for(i=0;i<=n;i++)
		a[i]=sc.nextInt();
	}
	
	
	
	largest=a[0];
	for(i=1;i<=n;i++) {
		if(a[i]>largest)
			largest=a[i];
			
		
	}
	slargest = Integer.MIN_VALUE;
	for(i=0;i<n;i++) {
		if(a[i]>slargest && a[i]!=largest) {
			slargest=a[i];
			
		}
		
	}
	System.out.println("Largest num="+largest);
	System.out.println("second largest="+slargest);
	
	

}

	
}