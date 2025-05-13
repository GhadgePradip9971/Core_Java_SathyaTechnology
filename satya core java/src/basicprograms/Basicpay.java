package basicprograms;
import java.util.*;

public class Basicpay {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
double netpay,basicpay,gpay,pf=0,da=0,hra=0;



System.out.println("enter basic pay=");                                 //netpay=basicpay+da+hra
    basicpay=sc.nextDouble() ;  
                                                                //Gpay=netpay-pf

System.out.println("da="+basicpay*0.25);
System.out.println("hra="+basicpay*0.15);
System.out.println("pf="+basicpay*0.25);

System.out.println("netpay="+(netpay=basicpay+da+hra));
System.out.println("gpaypay="+(gpay=netpay-pf));




	}

}
