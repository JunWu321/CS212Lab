// Add an overlaps method to Range, which determines whether this Range has any numerical overlap with another Range.
  

public boolean overlaps(Range other) {
    if (this.high<other.low) return false;
    if (this.low>other.high) return false;
    return true;
}

// Add an overlaps method to NumberArray, which determines this NumberArray has any overlap with another NumberArray.
  
public boolean overlaps(NumberArray other) {
    for (double num1 : nums) {
        for (double num2 : other.nums) {
            if (num1 == num2) {
                return true;
            }
        }
    }
    return false;
}

// Write the class MultiGroup which implements NumberGroup. A MultiGroup takes a list of NumberGroups as the constructor parameter and 
// copies the elements of the list into its field. It contains a number if any of its NumberGroups contain that number.
