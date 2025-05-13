package basicprograms;
import java.util.*;

public class Vovel {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		char ch;
		System.out.println("Enter the character=");
		ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println("Vowels");
			break;
	    default:
				System.out.println("Consonant");
			
		
		}

	}

}
