// Add an overlaps method to Range, which determines whether this Range has any numerical overlap with another Range.
  

  public boolean overlaps(Range a) {
    for (int i = this.low; i <= this.high; i++) {
      for (int j = a.low; j <= a.high; j++) {
        if (i == j) {
          return true;
        }
      }
    }
    return false;
  }

// Add an overlaps method to NumberArray, which determines this NumberArray has any overlap with another NumberArray.
  

// Write the class MultiGroup which implements NumberGroup. A MultiGroup takes a list of NumberGroups as the constructor parameter and 
// copies the elements of the list into its field. It contains a number if any of its NumberGroups contain that number.
