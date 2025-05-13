package loops;
import java.util.*;
public class Armstrongnumber {

	public static void main(String args[]) {
 Scanner sc=new Scanner (System.in);
 int n=0,temp1,temp2,rem,count=0,x,y,sum=0;
 System.out.println("Enter a number=");
 n=sc.nextInt();
 
 temp1=n;
   while(temp1>0) {
	         temp1=temp1/10;
	          count++;
           }
 
       temp2=n;
     while(temp2>0) 
           {
	           rem=temp2%10;
            x=1;y=count;
 
        while(y>0)
         {
	        x=x*rem;
	        y--;
          }
             sum=sum+x;
             temp2=temp2/10;
 
	     }

	
            if(sum==n) 
	                 System.out.println("armstrong number");
	 
                else 
	                 System.out.println("not armstrong number");
 
 
 
 
 
	}

}
