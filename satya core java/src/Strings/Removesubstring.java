package Strings;

public class Removesubstring {
	public static void main(String[] args) {
		String s = "welcome to sathya ";
		String str[] = s.split(" ");
		String substr = "sathya";
		String result = " ";

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(substr))
				continue;
			else
				result = result + " " + str[i];

		}
		System.out.println(result);
	}

}
