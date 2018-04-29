package Groupon;

public class reverseAString {
	private static String reverseString(String str) {
		if (str == null) {
			return str;
		}
		char[] charString = str.toCharArray();
		for (int i = 0; i <= charString.length / 2 - 1; i++) {
			char ch = charString[i];
			charString[i] = charString[charString.length - 1 - i];
			charString[charString.length - 1 - i] = ch;
		}
		return new String(charString);
	}

	// process.
	private static String Process(String str1) {
		String resultStr = null;
		try {
			if (str1 == null) {
				System.out.println("Invalid string.");
				return "";
			}
			String[] strArr = str1.split(" ");
			for (String str : strArr) {
				if (resultStr == null) {
					resultStr = "";
				}
				resultStr = resultStr.concat(reverseString(str) + " ");
			}
		} catch (Exception e) {
			System.out.println("Invalid string.");
		}

		return resultStr.substring(0, resultStr.length() - 1);
	}

	// main method for testing
	public static void main(String[] args) {
		// Positive test case
		String strTest = "I am done with this code.";
		System.out.println("Validating positve scenario : " + Process(strTest));

		// More than one space between 2 words
		strTest = " aaaaabbbbbb   Sharma";
		System.out.println("Validating string it has more than one space between 2 words : " + Process(strTest));

		// when sting is null
		strTest = null;
		System.out.println("Validating Null String: " + Process(strTest));

		// single word string
		strTest = "Saurabh ";
		System.out.println("Validating single word string: " + Process(strTest));

	}
}
