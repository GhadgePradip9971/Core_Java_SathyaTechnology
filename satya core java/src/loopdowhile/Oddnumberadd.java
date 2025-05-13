package loopdowhile;
import java.util.*;
public class Oddnumberadd {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n,i,sum=0;
  
  System.out.println("Enter the value of n=");
  n=sc.nextInt();
  
  i=1;
  do {
	  sum=sum+1;
	  i=i+2;
  }
  while(i<n);
  
  System.out.println("sum of odd number="+sum );
	}

}
