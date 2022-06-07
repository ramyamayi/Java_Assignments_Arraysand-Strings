package Arrays_Strings;

public class UniqueString_Reverse {

	public static void main(String[] args) {
boolean ans =uniqueString("ramya");
System.out.println(ans);
String str ="Be Happy and Stay Motivated";


String[] words = str.split(" ");
for(String s :words) {
	char[] c = s.toCharArray();
	for(int i = s.length()-1;i>=0;i--) {
		System.out.print(c[i]);
	
}
	System.out.print(" ");
	}
	
	}

public static boolean uniqueString (String str) {
	for(int i=0;i<str.length();i++) {
		for (int j = i + 1; j < str.length(); j++) {
			if(str.charAt(i) == str.charAt(j)) {

			return false;}
		
}

}
	
		return true;
	
}
}