import java.util.*;

public class Exercise22_28 {
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
		Set<Character> patternSet = new HashSet<>();
		for (int i = 0; i < pattern.length(); i++)
			patternSet.add(pattern.charAt(i));
		
    int i = pattern.length() - 1;
    while (i < text.length()) {
    	int k = i;
    	int j = pattern.length() - 1;
    	while (j >= 0) {
    		if (text.charAt(k) == pattern.charAt(j)) {
    			k--; j--;
    		}
    		else {
    			break;
    		}
    	}
    	
    	if (j < 0)
    		return i - pattern.length() + 1; // A match found
    	
    	if (patternSet.contains(text.charAt(k))) {
    		i = i + (pattern.length() - findLast(text.charAt(k), j - 1, pattern) - 1);
    	}
    	else {
    		i = i + pattern.length();
    	}
    }

		return -1;
  }
	
	// Return the index of the last element in pattern[0 .. j] that matches ch
	private static int findLast(char ch, int j, String pattern) {
    for (int k = j; k >= 0; k--) {
			if (ch == pattern.charAt(k)) {
				return k;
			}
    }
    
    return -1;
	}
}
