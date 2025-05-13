package Arrays;
import java.util.*;

public class Largestelement {             

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a[]= {12,34,45,67,78,90,33,40,60};
int i,largest,smallest;
smallest=a[0];
//largest=a[0];

for(i=1;i<a.length;i++) {
	//if(a[i]>largest)
		if(a[i]<smallest)
		smallest=a[i];
}
	//System.out.println("largest="+largest);
System.out.println("smallest="+smallest);
















	}

}
