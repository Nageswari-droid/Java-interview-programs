package sequence;

public class SequenceClass {
	public static void main(String args[]) {

		int num = 6;
		String str = "";

		if (num == 1) {
			System.out.println("1");
		}
		if (num == 2) {
			System.out.println("11");
		}

		str = "11";
		
		for (int i = 3; i <= num; i++) {
			str = str;
			String result = "";
			int count = 1;
			
			char[] arr = str.toCharArray();

			for (int j = 1; j < str.length(); j++) {
				if (arr[j] != arr[j - 1]) {
					result = result + count;
					result = result + arr[j - 1];
					count = 1;
				} else {
					count++;
				}
			}
			str = result;
		}

		System.out.println(str);
	}
}
