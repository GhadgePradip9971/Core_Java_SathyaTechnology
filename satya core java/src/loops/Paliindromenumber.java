package loops;
import java.util.*;

public class Paliindromenumber {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n, rem=0,rev=0;
	
	System.out.println("Enter the value of n=");
	  n=sc.nextInt();
     int temp=n;

	while(n>0) {
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(temp==rev) {
		System.out.println("palindrome number");
	}
	else {
		System.out.println("not palindrome number");
	}
}
}
