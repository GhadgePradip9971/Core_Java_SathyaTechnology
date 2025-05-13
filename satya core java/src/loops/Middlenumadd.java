package loops;
import java.util.*;

public class Middlenumadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,product=1,rem;

		System.out.println("Enter the value of n=");
		n=sc.nextInt();
		
		n=n/10;//remov elast digit
		
		while(n>9) {
			rem=n%10;
			product=product*rem;
			n=n/10;
		}
		
		System.out.println("product of middle numbers="+product);
		
	}

}
