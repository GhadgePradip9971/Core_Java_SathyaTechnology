package simple;
import java.util.*;

public class Simplecal {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a,b;
int choice=0;

System.out.println("****************Simple Cal**************");
System.out.println("1:Addition");
System.out.println("2:Subtraction");
System.out.println("3:Multiplication");
System.out.println("4:Division");
System.out.println("5:Modulo Division");
System.out.println("6:exit");

System.out.println("Enter value of a=");
a=sc.nextInt();
System.out.println("Enter value of b=");
b=sc.nextInt();
System.out.println("Enter your choice=");
choice=sc.nextInt();

switch(choice) 
{
case 1:
	System.out.println(a+b);
	break;
case 2:
	System.out.println(a-b);
	break;
case 3:
	System.out.println(a*b);
	break;
case 4:
	System.out.println(a/b);
	break;
case 5:
	System.out.println(a%b);
	break;
case 6:
	System.out.println("exit");
	break;
	
}

	


	
	}

}
