package loops;
import java.util.*;

public class Decimaltobinary {

	public static void main(String[] args) {
  Scanner sc=new Scanner (System.in);
  int bnum=0,dnum=0,rem,base=1;
  System.out.println("Enter the binary number=");
  bnum=sc.nextInt();
  
  
  while(dnum>0) {
	  rem=dnum%2;
	  bnum=bnum+rem*base;
	  dnum=dnum/2;
	  base=base*10;
  }
  System.out.println("binary equivalent to decimal="+bnum);
	}

}
