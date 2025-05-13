package methodcalling; 

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
      fibonnaci_series();



	}
	
	static void fibonnaci_series() {
		Scanner sc=new Scanner (System.in);
		int limit,fib1=0,fib2=1,count=2,fib3=0;
		
		System.out.println("Enter the limmit of fiboonacci series");
		limit=sc.nextInt();
		System.out.println(fib1+ " "+fib2+" ");
		
		do {
			fib3=fib1+fib2;
			System.out.print(fib3+" ");
			fib1=fib2;
			fib2=fib3;
			count++;
		}
		while(count<=limit);
		
		
		
		
		
		
		
	}
	
	

}
