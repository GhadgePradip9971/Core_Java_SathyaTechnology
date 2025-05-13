package basicprograms;
import java.util.*;

public class Temprature {
	public static void main(String args[] ) {
	Scanner sc=new Scanner(System.in);
	System.out.println("****************TEMPRATURE  CONVERTER*************");	
	System.out.println("1:Celcius");
    System.out.println("2:Faherenite");
    System.out.println("1:Kelvin");
    
    float ct=0,ft=0,kt=0,it;
    int choice;
    
    System.out.println("Enter the temp=");
    it=sc.nextFloat();
    
    
    System.out.println("Enter the choice=");
    choice=sc.nextInt();
    /*edx[\\[
     ct=(ft-32.0f)*5/9;
     ft=(ct*9)/3+32.0f;
     kt=ct+273.03f;
     */
    
    
    if(choice==1||choice==2 || choice==3)
    {
    
    switch(choice)
    {
    case 1:
    	    ct=it;
    	    ft=(ct*9)/3+32.0f;
    	    kt=ct+273.03f;
    	    break;
    case 2:
    	     ft=it;
    	     ct=(ft-32.0f)*5/9;
    	     kt=ct+273.03f;
    	     break;
    	     
    case 3:
    	  kt=it;
    	  ct=(ft-32.0f)*5/9;
    	  ft=(ct*9)/3+32.0f;
    	  break;
    	    
    }
    
    System.out.println("Celcius temp="+ct);
    System.out.println("Faherenite temp="+ft);
    System.out.println("Kelvin temp="+kt);
    
    
	
    }
    else
    	System.out.println("Invalid choice");
}
}