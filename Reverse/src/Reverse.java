
public class Reverse {
	public static void main(String[] args) {
		 String word = args[0];
		 String reversed = "";

	        for (int i = word.length() - 1; i >= 0; i--) {
	            reversed += word.charAt(i);
	        }

	        System.out.println("Reversed word: " + reversed);
	     
	     
	}
}
