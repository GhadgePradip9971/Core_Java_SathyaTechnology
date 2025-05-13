package Nestedforloop;
import java.util.*;
public class Pallindromnumber {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n,rev=0,rem,i=0,j=0;
System.out.println("Enter tyhe value of n=");
n=sc.nextInt();

for(i=1;i<=n;i++) {
	rev=0;
	for(j=1;j>=0;) {
		rem=j%10;
		rev=rev*10+rem;
		j=j/10;
		
	}
}
if(i==rev) {
	System.out.println("pallindrome numbers="+i);
	
}







	}

}
