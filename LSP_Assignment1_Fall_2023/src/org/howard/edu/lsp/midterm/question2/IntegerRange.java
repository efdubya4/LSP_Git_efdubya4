package org.howard.edu.lsp.midterm.question2;

public class IntegerRange implements Range {
	private final int lowerBound;
	private final int upperBound;
	
// constructs an INtegerRange with the specified lwer and upper bounds
	public IntegerRange(int lowerBound, int upperBound) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		
	}
	//{@inheritDoc}
    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    //{@inheritDoc}
    @Override
    public boolean overlaps(Range other) {
        return this.contains(other.lowerBound) || this.contains(other.upperBound);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int size() {
        return upperBound - lowerBound + 1;
    }

    /**
     * Overrides the equals method to compare if two ranges are equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        IntegerRange other = (IntegerRange) obj;
        return lowerBound == other.lowerBound && upperBound == other.upperBound;
    }
}

