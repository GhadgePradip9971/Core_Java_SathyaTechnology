//write a java program which reads the intiger number from the keybord and perform the arithmatic operation      by implemnting a simple calculator using a switch statemnet


package basicprograms;
import java.util.*;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
				System.out.println("**********SIMPLE CALCULATOR***********");
				 System.out.println("1:ADDITION");
				 System.out.println("2:SUBSTRACTION");
				 System.out.println("3:MULTIPLICATOION");
				 System.out.println("4:QUOTUENT");
				 System.out.println("5:REMAINDER");
				 
				 int a,b;
				 char choice;
				 
				 System.out.println("Enetr the values of a and  b=");
				 a=sc.nextInt()	;
				 b=sc.nextInt()	;
				 
				 System.out.println("Enetr the choice=");
				 choice=sc.next().charAt(0);
				 
				 switch(choice)
				 {
				 case'1':
					 System.out.println("Addition="+(a+b));
					 break;
					 
				 case'2':
					 System.out.println("Substraction="+(a-b));
					 break;
					 
				 case'3':
					 System.out.println("Multiplication="+(a*b));
					 break;
					 
				 case'4':
					 System.out.println("Quotient="+(a/b));
					 break;
					 
				 case'5':
					 System.out.println("Remainder="+(a%b));
					 break;
					 
					 default:
					 
						 System.out.println("Invalid Option");
						 
					 
				 }
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
	}

}
