package loopdowhile;
import java.util.*;

public class Fibonacciseries {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int limit,fib1=0,fib2=1,fib3,count=2;
	System.out.println("Enter the limit of =");
	limit=sc.nextInt();
	
	System.out.println(fib1+"  "+fib2);
	
	do {
		fib3=fib1+fib2;
		System.out.println(fib3+" ");
		fib1=fib2;
		fib2=fib3;
		
		count++;
		
	}
	while(count<=limit);
}
}
