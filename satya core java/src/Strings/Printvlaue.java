package Strings;

public class Printvlaue {

	public static void main(String[] args) {
		String s = " ab3cd2ef4";// string s= "ab3cd2ef"
		int i, j;
		for (i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			char ch2 = (i + 1) < s.length() ? s.charAt(i + 1) : ' ';

			if (ch2 >= '0' && ch2 <= '9') {
				for (j = 0; j < ch2 - 48; j++)
					System.out.print(ch1);
				i++;

			} else
				System.out.print(ch1);

		}
	}

}
