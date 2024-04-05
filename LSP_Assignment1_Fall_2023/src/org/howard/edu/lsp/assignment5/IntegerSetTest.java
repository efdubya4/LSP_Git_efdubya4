package org.howard.edu.lsp.assignment5;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
    private IntegerSet set1;
    private IntegerSet set2;

    @BeforeEach
    void setUp() {
        // Initialize IntegerSets for testing
        set1 = new IntegerSet();
        set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        set1.clear();
        assertTrue(set1.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        assertEquals(3, set1.length());
        assertEquals(3, set2.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet set3 = new IntegerSet();
        set3.add(3);
        set3.add(2);
        set3.add(1);
        assertTrue(set1.equals(set3));
        assertFalse(set1.equals(set2));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        assertTrue(set1.contains(2));
        assertFalse(set2.contains(6));
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() {
        assertEquals(3, set1.largest());
        assertThrows(IntegerSetException.class, () -> set2.largest());
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() {
        assertEquals(1, set1.smallest());
        assertThrows(IntegerSetException.class, () -> set2.smallest());
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        set1.add(4);
        assertTrue(set1.contains(4));
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        set1.remove(2);
        assertFalse(set1.contains(2));
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        set1.union(set2);
        assertTrue(set1.contains(5));
        assertEquals(6, set1.length());
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        set1.intersect(set2);
        assertTrue(set1.contains(3));
        assertEquals(1, set1.length());
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        set1.diff(set2);
        assertTrue(set1.contains(1));
        assertFalse(set1.contains(3));
        assertEquals(1, set1.length());
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        set1.complement(set2);
        assertTrue(set1.contains(4));
        assertFalse(set1.contains(1));
    }
}
