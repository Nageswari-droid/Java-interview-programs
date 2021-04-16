import java.util.Scanner;

public class ReverseClass {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		String str = obj.next();

		char[] charArr = str.toCharArray();

		String vowel = "";

		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == 'a' || charArr[i] == 'e' || charArr[i] == 'i' || charArr[i] == 'o' || charArr[i] == 'u') {
				vowel += charArr[i];
				charArr[i] = ' ';
			}
		}

		int j = vowel.length() - 1;

		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == ' ') {
				charArr[i] = vowel.charAt(j);
				j--;
			}
		}

		for (int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i]);
		}

	}
}
