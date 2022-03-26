public class Exercise22_04 {
	public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter a string text: ");
    String text = input.nextLine();
    System.out.print("Enter a string pattern: ");
    String pattern = input.nextLine();
    
    int index = match(text, pattern);
    if (index >= 0)
      System.out.println("matched at index " + index);
    else
      System.out.println("unmatched");   

    // System.out.println(match("aerbbbcbbb", "bbcb"));
	}

	/**
	 * The worst-case complexity is O(nm), where n is text.length() and m
	 * is pattern.length()
	 *
	 * @param s String
	 * @param pattern String
	 * @return int
	 */
	public static int match(String text, String pattern) {
    for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
    	if (isMatched(i, text, pattern))
    		return i;
    }

		return -1;
  }
	
	// Test if pattern matches text starting at index i
	private static boolean isMatched(int i, String text, String pattern) {
    for (int k = 0; k < pattern.length(); k++) {
			if (pattern.charAt(k) != text.charAt(i + k)) {
				return false;
			}
    }
    
    return true;
	}
}
