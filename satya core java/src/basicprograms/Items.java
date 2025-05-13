package basicprograms;
import java.util.*;

public class Items {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
float profit,sp=0,cp=0,profit_per;

System.out.println("Enter selling price=");
sp=sc.nextFloat();



System.out.println("Enter Cost price=");
sp=sc.nextFloat();

profit=sp-cp;
cp=sp+profit;
profit_per=profit/cp*100;


System.out.println("Enetr profit="+profit);
System.out.println("Enetr profit="+cp);
System.out.println("Enetr profit="+profit_per);


System.out.println("Enetr profit per items="+cp/15);







	}

}
