package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee1 {

	public static void main(String args[]) throws IOException

	{
		int rollno;
		String name;
		System.out.println("Enter your roll no and name=");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		rollno = Integer.parseInt(br.readLine());
		name = br.readLine();
		System.out.println(rollno);
		System.out.println(name);

	}

}
