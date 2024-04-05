package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;

import org.howard.edu.lsp.assignment5.IntegerSet;

public class Driver {
    public static void main(String[] args) {
        // Create IntegerSet instances for testing
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());

        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Value of Set2 is: " + set2.toString());

        // Union of Set1 and Set2
        System.out.println("Union of Set1 and Set2");
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());

        // Intersection of Set1 and Set2
        System.out.println("Intersection of Set1 and Set2");
        set1 = new IntegerSet(new ArrayList<>(Set.of(1, 2, 3)));
        set1.intersect(set2);
        System.out.println("Result of intersection of Set1 and Set2: " + set1.toString());

        // Difference of Set1 and Set2
        System.out.println("Difference of Set1 and Set2");
        set1 = new IntegerSet(new ArrayList<>(Set.of(1, 2, 3)));
        set1.diff(set2);
        System.out.println("Result of difference of Set1 and Set2: " + set1.toString());

        // Complement of Set1 with respect to Set2
        System.out.println("Complement of Set1 with respect to Set2");
        set1 = new IntegerSet(new ArrayList<>(Set.of(1, 2, 3)));
        set1.complement(set2);
        System.out.println("Result of complement of Set1 with respect to Set2: " + set1.toString());
    }
}
