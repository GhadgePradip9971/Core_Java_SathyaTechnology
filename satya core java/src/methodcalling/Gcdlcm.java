package methodcalling;
import java.util.*;


class GCD
{
	public int gcd_of_two(int a, int b)
	{
		int den,num,rem=0;
		if(a>b) {
			num=a;
			den=b;
		}
		else {
			num=b;
			den=a;
		}
		while(rem!=0) 
		{
		
		num=den;
		den=rem;
		rem=num%den;
	}
	
	return den;
}
}


class LCM{
	public int lcm_of_two(int a, int b) 
	{
		int i,largest,lcm=0;
		
		largest=(a>b)?a:b;
		
		for(i=1;i<=largest;i++) {
			if(largest%a==0 && largest%b==0) {
				
				lcm=largest;
				break;
			}
			largest++;
		}
		return lcm;
		
		
	}
}


public class Gcdlcm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,result1,result2;
		
		System.out.println(" Enter the value of a and b=");
		a=sc.nextInt();
		b=sc.nextInt();
		GCD g=new GCD();
		result1= g.gcd_of_two(a,b);
		System.out.println("gcd of two numbers="+result1);
		LCM l=new LCM();
		result2=l.lcm_of_two(a, b);

		System.out.println("lcm of two numbers="+result2);

		
	}

}
