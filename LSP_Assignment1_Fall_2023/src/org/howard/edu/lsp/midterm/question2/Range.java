package org.howard.edu.lsp.midterm.question2;

public interface Range {
	// Returns true if the range contains the specified value, false otherwise.
    
	boolean contains(int value);

    //Returns true if the range overlaps with another range, false otherwise.
   
	boolean overlaps(Range other);

    //Returns the number of integers in the range.
    int size();
}
