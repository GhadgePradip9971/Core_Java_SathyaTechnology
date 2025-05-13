package simple;
import java.util.*;
public class Principal {

	public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int totalloan=110000;            
double acre=0,p,r=0,t=1,si;

System.out.println("Enter the acres you have=");
acre=sc.nextDouble();
if(acre<=3) {
	
	r=2;
	
}
else if(acre>3 &&  acre<=6) {
	r=10;
}
else if(acre>6 &&  acre<=10) {
	r=20;
	
}
else {
	System.out.println("not elligible for loan");
}




si=(totalloan*r*t)/100;
System.out.println("simple interest="+si);






	}

}
