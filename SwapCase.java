package Arrays_Strings;

public class SwapCase {

	public static void main(String[] args){
String str = "heLLo WorLD";
char[] chars = str.toCharArray();
for(int i =0;i<chars.length;i++) {
	chars[i] = Character.isUpperCase(chars[i])? Character.toLowerCase(chars[i]) : Character.toUpperCase(chars[i]);
}
System.out.println("Converting case: "+new String(chars));
}
}
