package loops;
import java.util.*;

public class Digitoccurance {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n,digit,rem,count=0;
  
  System.out.println("Enter the number");
  n=sc.nextInt();
  
  System.out.println("Enter the digit");
  digit=sc.nextInt();
  
  while(n>0) {
	  rem=n%10;
	  if(rem==digit) 
		  count++;
		  n=n/10;
		  
	  
	 System.out.println("Occurance of "+digit+"in a given number"); 
	  
	  
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
	}

}
