package Nestedforloop;
import java.util.*;

public class Primenumbers {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,flag=0,count=0;
		
		System.out.println("Enter value of n="); //print the prime numbers up to the given number
		n=sc.nextInt();
		
		for(i=2;i<=n;i++) {
			flag=0;
			for(j=2;j<=i/2;j++) {
				if(i%j==0)
				{
					flag=1;
					break;
				}
				
			}
			
			if(flag==0)
			{
				System.out.println(i+ "  ");
				count++;
				
			}
		}
		
		
		
	}

}
