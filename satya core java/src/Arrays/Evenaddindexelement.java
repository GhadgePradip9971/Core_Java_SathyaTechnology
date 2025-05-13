package Arrays;

public class Evenaddindexelement {

	public static void main(String[] args) {
int a[]= {12,13,24,46,56,70};
int i,n, esum=0,osum=0,sum=0;

for(i=0;i<a.length;i++) {
	if(i%2==0)
		esum=sum+a[i];
	else
		osum=sum=a[i];
	
		
}
System.out.println("esum="+esum);
System.out.println("osum="+osum);


	
	}

}
