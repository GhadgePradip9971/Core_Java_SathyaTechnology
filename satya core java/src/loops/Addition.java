package loops;
import java.util.*;
public class Addition {

	public static void main(String[] args) {
		 Scanner sc=new Scanner (System.in);
		 int i=1, n=0,psum=0,nsum=0;
		 
		 System.out.println("Enter the values of n=");
		 n=sc.nextInt();
		 
		 
		 while(n!=0) {
			 if(n>0) {
				 psum=psum+1;
				 
			 }
			 else 
			 {
				 nsum=nsum+1;
			 }
		
			 
			 System.out.println("Enter the values of n=");
			 n=sc.nextInt();
			 System.out.println(psum);
			 System.out.println(nsum);
			
			 
		 }
		 
		 
	}

}
