package loops;
import java.util.*;
public class Swapfirstlast {

	public static void main(String[] args) {		
		Scanner sc=new Scanner (System.in);
		int n,firstdigit=0,lastdigit,result,temp,count=0,digits;
		
		System.out.println("Enter the value of n=");
		n=sc.nextInt();
	lastdigit=n%10;
	
	temp=n;
	while(temp>0) {
		firstdigit=temp%10;
		temp=temp/10;
		count++;
		
	}
	digits=count-1;
	result=lastdigit;
	result=result*(int)Math.pow(10, digits);
	result=result+n%(int)Math.pow(10, digits);
	result=result-lastdigit;
	result=result+firstdigit;
	
	
	System.out.println(result);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
