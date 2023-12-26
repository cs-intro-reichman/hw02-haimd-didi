/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str = args[0];
		String newStr = "";
		int n = str.length();

		for(int i=n-1;i>=0;i--){
			newStr+=str.charAt(i);
		}

		char middle = newStr.charAt(n/2);
		
		System.out.println(newStr);
		System.out.println("The middle character is "+ middle);

	}
}
