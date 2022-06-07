package Arrays_Strings;

public class RemoveSpaces {

	public static void main(String[] args) {
		String  str = "This is the test string for removing spaces";
		str=str.replaceAll("\\s", "");
		System.out.println(str);	}

}
