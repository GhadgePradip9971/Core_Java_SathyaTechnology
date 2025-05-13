package methodcalling;
import java.util.*;

public class largestofthree {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.print("Enter the value of a,b and c=");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

largest_of_three (a,b,c);
	}
static void largest_of_three(int x,int y,int z)
{
	if(x>y)
	{
		if(x>z) {
			System.out.print("X is greather");
			
		}
		else {
			System.out.print("z islargest");
		}
		
	}
	
	else
	{
		if(y>z) {
			System.out.print("Y is largest");
		}
		else
		{
			System.out.print("z is largest");
		}
	}
}
}
