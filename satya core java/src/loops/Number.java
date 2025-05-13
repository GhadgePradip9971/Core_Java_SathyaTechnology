package loops;
import java.util.*;
public class Number {
	
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n ,num,psum=0, nsum=0,i;
	
	System.out.println("Enter the value of n=");
	n=sc.nextInt();
			
	i=1;
	while(i<=n) {
		
		System.out.println("Enter the number=");
		num=sc.nextInt();
		
		if(n>0) {
			psum=psum+num;
		}
		else 
			nsum=num+num;
			i++;
		
	}
	System.out.println("Sum of the negative number="+nsum);
	System.out.println("Sum of the positive number="+psum);

}
}
