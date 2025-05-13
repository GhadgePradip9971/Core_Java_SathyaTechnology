package loops;
import java.util.*;

public class Adamnumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int temp,n,sqr,sqr1,rev=0,rem,rev1=0;
		System.out.println("Enter t6he value of n=");
		n=sc.nextInt();
	sqr=n*n;
	temp=n;
	
	while(temp>0) {
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
		
	}
	sqr1=rev*rev;
	
	while(sqr1>0) {
		rem=sqr1%10;
		rev1=rev1*10+rem;
		sqr1=sqr1/10;
		
	}
	if(sqr==rev1) {
		System.out.println("it is Adam number");
		
	}
	else {
		System.out.println("it is not Adam number");
	}
	
	
	
	}

}
