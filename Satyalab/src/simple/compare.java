package simple;
import java.util.*;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a,b,c;
		System.out.println("Enter the three numbers=");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greather");
			}
			else
			{
				System.out.println("c is greather");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B is greather");
			}
			else
			{
				System.out.println();
			}
		}
		
		
		
		
		
	}

}
