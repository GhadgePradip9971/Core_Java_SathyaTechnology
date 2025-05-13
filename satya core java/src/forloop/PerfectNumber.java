package forloop;
import java.util.*;

public class PerfectNumber {

	public static void main(String[] args) {
 Scanner sc=new Scanner (System.in);
 int n=0,sum=0;
 System.out.println("Enter the number=");
 n=sc.nextInt();
 
 
 for(int i=1;i<n;i++) {
	 
	 
	 if(n%i==0) {
		 sum=sum+i;

	 }
	 if(n==sum) 
		 System.out.println("perfect number");
	 
	 else 
		 System.out.println("not perfect number");
	 
 }
 
	}

}
