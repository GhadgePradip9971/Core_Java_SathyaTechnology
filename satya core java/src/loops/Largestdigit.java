package loops;
import java.util.*;

public class Largestdigit {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=0,rem,x,largest;
  System.out.println("Enter a value of n=");
  n=sc.nextInt();

  
  largest=0;
  while(n>0) {
	  rem=n%10;
	  if(rem>largest) 
		  largest=rem;
		  n=n/10;
		  
  }  
	  System.out.println("Largest Digit"+largest);
	  
  
	}

}
