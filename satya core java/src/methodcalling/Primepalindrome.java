package methodcalling;
import java.util.*;









public class Primepalindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b;
	System.out.println(" Enter value of a and b=");
	a=sc.nextInt();
	b=sc.nextInt();

	for(int i=a;i<=b;i++) {
		if(isprime(i)&& ispalindrome(i))
			System.out.println(i+ "");
	}
	
	
	}
	
	
	
	static boolean isprime(int n) 
	{
		int i,count=0;
		i=1;
		while(i<=n)
		{
			if(n%i==0)
				count++;
			i++;
		}
		if(count==2) 
			return true;
		else
			return false;
	
	}
	
	static boolean ispalindrome(int n) {
		int rem,rev=0,temp;
		temp=n;
		while(n>0) {
			rem=temp%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev)
			return true;
		else
			return false;
		
	}
	
	
	
	
	
	
	

}
