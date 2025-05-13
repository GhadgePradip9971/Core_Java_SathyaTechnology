package loops;
import java.util.*;
public class Primenumber {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n,i,count=0,x=0;
System.out.println("Enter the value of n=");
n=sc.nextInt();

/*
i=1;
while(i<=n) {
	if(n%i==0)
		count++;
	i++;
	
}
if(count==0) {
	System.out.println("it is a prime number");
}
else
	System.out.println("not a prime number");
*/

i=2;
while(i<=n/2) {
	if(n%i==0) {
		x=1;
		break;
		
	}
	i++;
}
if(x==0) {
	System.out.println(n+"is aprime number");
	
}
else
	System.out.println(n+"not a prime number");










	}

}
