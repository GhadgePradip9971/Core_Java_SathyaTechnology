package Patternlevel3;
import java.util.*;

public class Star {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int i,j,n,k;
System.out.println("Enter the value of n=");
n=sc.nextInt();

	/*
	for(i=1;i<=n;i++) {
		for(j=1;j<=n-i;j++) 
			System.out.print(" ");
		for(j=1;j<=2*i-1;j++)
			System.out.print("*");
		System.out.println(" ");
		
	}
		
	
	for(i=n-1;i>=1;i--) {
		for(j=1;j<n-i;j++)
			System.out.print(" ");
		for(j=1;j<=2*i-1;j++)
			System.out.print("*");
	}
		*/
//		
////
//}
	
//
//for(i=1;i<=n;i++) {
//	for(j=1;j<n-i;j++) {
//		System.out.print(" ");
//}
//	for(j=1;j<=i;j++) {
//	System.out.print("*");
//	}
//	
//	
//	
//	
//	}
//	}
//}

for(i=1;i<n;i++)
{
	if(i<=5) {
	for(j=1;j<=5-i;j++) {
		System.out.print(" ");
		
	}
	
	for(j=1;j<=i;j++)
	{
		System.out.print("*");	
	}System.out.println("");
	}
	
	else {
		for(j=1;j<=i-5;j++)
		{
			System.out.print(" ");	

		}
		for( j=i;j<n;j++)
		{
			System.out.print("*");
			
		}System.out.println("");
	}
}


}
	}
