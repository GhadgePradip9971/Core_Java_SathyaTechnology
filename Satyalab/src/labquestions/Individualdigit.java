package labquestions;

public class Individualdigit {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int n=789789,rem,sum=0;
		
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
System.out.println("sum of individual number="+sum);	

}
}