package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
	public static String encrypt(String text) {
		// Init two StringBuilder objects to hold even and odd characters separately
		StringBuilder evenChars= new StringBuilder();
		StringBuilder oddChars= new StringBuilder();
		
		// Iterates through the characters in the input text
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			// remove punctuation and whitespace
			if (!Character.isWhitespace(c) && !Character.isWhitespace(c)&& !Character.isWhitespace(c)) {
				// append even-index chars to evenChars Stringbuilder
				if (i%2 == 0) {
					evenChars.append(c);
				} else {
					//append odd-index chars to oddChars Stringbuilder
					oddChars.append(c);
				}
			}
		}
	}
}