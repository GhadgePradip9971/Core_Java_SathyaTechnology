package loops;
import java.util.*;

public class Firstlastnumberadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		int n,firstdigit=0,lastdigit=0,sum=0;
		System.out.println("Enter the value of n=");
            n=sc.nextInt();
            lastdigit=n%10;
            
            while(n>0)
            {
            	firstdigit=n%10;
            	n=n/10;
            }
            sum=firstdigit+lastdigit;
            System.out.println("Sum of first and  last digit = "+sum);
            
}

}
