package loopdowhile;
import java.util.*;

public class Primenumber {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int i,n,count=0,flag=0;
 
 System.out.println("Enter the value of n=");
 n=sc.nextInt();
/* 
 i=1;
 do {
	 if(n%1==0) {
		 count++;
		 i++;
	 }
	 while(i<=n);
	 
	 if(count==2)
	 System.out.println("prime number");
	 else
	  System.out.println("prime number");
		 
	 
	 
 }
 */
 
 if(n==2)
	 System.out.println("prime number");
 
 

 else 
 {
	 i=2;
 
 do {
	 if(n%i==0) {
		 flag=1;
		 break;
		 
	 }
	 i++; 
 }
 
 while(i<=n/2);
 
 if(flag==0 )
	 System.out.println("prime number");
 else
	 System.out.println("not prime number");
 
 
 
 }
 }
}
