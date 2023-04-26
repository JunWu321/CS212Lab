package Fraction;
//Fraction class implementing Comparable Interface. Add an equals method

//equals returns a boolean BUT compareTo returns an int
//-1 means left hand side smaller than right hand side
//0 means left hand side EQUAL to right hand side
//1 means left hand side larger than right hand side

public class Fraction implements Comparable < Fraction > {
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
    //remember, numerator and denominator are ints, and dividing and int/int gives an int so we must cast it.
	double thisValue = (double) (this.numerator / this.denominator);
    double otherValue = (double) other.numerator/ other.denominator;
    return Double.compare(thisValue, otherValue);
  }

  // The equals method checks if this Fraction object is equal to another Fraction object.
  public boolean equals(Fraction other) {
    if (other == null) {
      return false;
    }
    //remember, numerator and denominator are ints, and dividing and int/int gives an int so we must cast it.
    double thisValue = (double) this.numerator / this.denominator;
    double otherValue = (double) other.numerator / other.denominator;
    return thisValue == otherValue;
  }

  @Override
  public String toString() {
    return numerator + "/" + denominator;
  }
}
