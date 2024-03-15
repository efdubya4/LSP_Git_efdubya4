package org.howard.edu.lsp.midterm.question2;

public class RangeTester {
	
    public static void main(String[] args) {
        // Create two IntegerRange objects
        Range range1 = new IntegerRange(1, 5);
        Range range2 = new IntegerRange(3, 7);

        // Test contains method
        System.out.println("range1 contains 3: " + range1.contains(3)); // Should print true

        // Test overlaps method
        System.out.println("range1 overlaps with range2: " + range1.overlaps(range2)); // Should print true

        // Test size method
        System.out.println("Size of range2: " + range2.size()); // Should print 5

        // Test equals method
        Range range3 = new IntegerRange(1, 5);
        System.out.println("range1 equals range3: " + range1.equals(range3)); // Should print true
    }
}
