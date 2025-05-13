package basicprograms;
import java.util.*;


public class Lastdigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a=0,b=0,c=0,p,q,r,s;
		p=a%10;
		q=b%10;
		r=c%10;
		s=p*q*r;
		
		System.out.println("Enter the numbers=");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
	/*	System.out.println("last digit of a="+(a%10));
		System.out.println("last digit of b="+(b%10));
		System.out.println("last digit of c="+(c%10));
	
		
		
		System.out.println("addtion of last digit numbers="+s);
		*/
		System.out.println("last digit of a="+(a%10)*(b%10)*(c%10));

		
	
				
	
	}

}
