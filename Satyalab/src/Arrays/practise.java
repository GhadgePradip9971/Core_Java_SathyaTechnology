package Arrays;
import java.util.*;

public class practise {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {15,12,7,21,29,35};
		int i,element,found=1;
		System.out.print("enyter element=");
		element=sc.nextInt();	
		
		for(i=0;i<arr.length;i++) {
			if(element==arr[i]) {
				found=1;
				break;
				
			}
			
		}
		if(found==1) 
			System.out.println("index="+i+" "+"value="+arr[i]);
			
		else {
			System.out.println("element is not presernt");
		}
		
	}

}
