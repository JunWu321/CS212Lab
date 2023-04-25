//Implement Fraction class extending Comparable Interface. Add an equals method

public class Fraction implements Comparable<Fraction> {
    public int numerator;
    public int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    // The compareTo method is used to compare this Fraction object with another Fraction object.
    @Override
    public int compareTo(Fraction other) {
        double thisValue = this.numerator / this.denominator;
        double otherValue = other.numerator / other.denominator;
        return Double.compare(thisValue, otherValue);
    }

    // The equals method checks if this Fraction object is equal to another Fraction object.
    public boolean equals(Fraction other) {
        // Check if the reference of this Fraction object and the other Fraction object is the same.
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }

        return numerator == other.numerator && denominator == other.denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
