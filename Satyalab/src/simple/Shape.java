package simple;
import java.util.*;
public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);


System.out.println("************Geometrical shapes***************");
System.out.println("1:Area Of Circle");
System.out.println("1:Area Of rectangle");
System.out.println("1:Area Of Triangle");
System.out.println("1:Area Of Square");
float radius,length,breadth,base,height,side,area;


int choice;
System.out.println("Enter the choice=");
choice=sc.nextInt();
switch(choice)
{
case 1:
	System.out.println(" Enter the radius=");
	radius=sc.nextFloat();
	area=3.14f*radius*radius;
	System.out.println("Area of circle="+area);
	break;
	
case 2:
	System.out.println("Enter the breadth and length=");
	breadth=sc.nextFloat();
	length=sc.nextFloat();
	area=length*breadth;
	System.out.println("Area of Reactangle="+area);
	break;
	
case 3:
	System.out.println("Enter the base and height=");
	base=sc.nextFloat();
	height=sc.nextFloat();
	area=0.5f*base*height;
	System.out.println("Area of Reactangle="+area);
	break;
	
	
case 4:
	System.out.println("Enter the side=");
	side=sc.nextFloat();
	area=side*side;
	System.out.println("Area of Reactangle="+area);
	break;
	
	
	default :System.out.println("Invalid choice");
	
}







	}

}
