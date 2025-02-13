package praticeFile.StringFunctions;


public class SubStringFunction {

	public static void main(String args[]) {
		String str = "aabbc";
		System.out.println("All substring of abbc are:" + str.length());

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));

			}
		}

	}

}
