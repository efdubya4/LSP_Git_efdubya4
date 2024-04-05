package org.howard.edu.lsp.assignment5;
import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
    // Store the set elements in an ArrayList
    private List<Integer> set = new ArrayList<Integer>();

    // Default Constructor
    public IntegerSet() {
    }

    // Constructor if you want to pass in already initialized
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    // Clears the internal representation of the set
    public void clear() {
        set.clear();
    }

    // Returns the length of the set
    public int length() {
        return set.size();
    }

    /*
     * Returns true if the 2 sets are equal, false otherwise; Two sets are equal if
     * they contain all of the same values in ANY order. This overrides the equal
     * method from the Object class.
     */
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof IntegerSet))
            return false;
        IntegerSet other = (IntegerSet) o;
        return this.set.containsAll(other.set) && other.set.containsAll(this.set);
    }

    // Returns true if the set contains the value, otherwise false
    public boolean contains(int value) {
        return set.contains(value);
    }

    // Returns the largest item in the set; Throws a IntegerSetException if the set
    // is empty
    public int largest() {
        if (set.isEmpty())
            throw new IllegalStateException("IntegerSet is empty");
        int max = Integer.MIN_VALUE;
        for (int num : set) {
            if (num > max)
                max = num;
        }
        return max;
    }

    // Returns the smallest item in the set; Throws a IntegerSetException if the set
    // is empty
    public int smallest() {
        if (set.isEmpty())
            throw new IllegalStateException("IntegerSet is empty");
        int min = Integer.MAX_VALUE;
        for (int num : set) {
            if (num < min)
                min = num;
        }
        return min;
    }

    // Adds an item to the set or does nothing it already there
    public void add(int item) {
        if (!set.contains(item))
            set.add(item);
    }

    // Removes an item from the set or does nothing if not there
    public void remove(int item) {
        set.remove((Integer) item);
    }

    // Set union
    public void union(IntegerSet intSetb) {
        for (int num : intSetb.set) {
            if (!set.contains(num))
                set.add(num);
        }
    }

    // Set intersection, all elements in s1 and s2
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    // Set difference, i.e., s1 –s2
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    // Set complement, all elements not in s1
    public void complement(IntegerSet intSetb) {
        List<Integer> complementSet = new ArrayList<>(intSetb.set);
        complementSet.removeAll(set);
        set = complementSet;
    }

    // Returns true if the set is empty, false otherwise
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // Return String representation of your set. This overrides the equal method
    // from the Object class.
    public String toString() {
        return set.toString();
    }
}
