package loops;
import java.util.*;

public class Binaryttodecimal {

	public static void main(String[] args) {
  Scanner sc=new Scanner (System.in);
  int bnum,dnum=0,rem,base=1;
  System.out.println("Enter the binary number=");
  bnum=sc.nextInt();
  
  
  while(bnum>0) {
	  rem=bnum%10;
	  dnum=dnum+rem*base;
	  bnum=bnum/10;
	  base=base*2;
  }
  System.out.println("Decimal Equivalent to binary="+dnum);
	}

}
