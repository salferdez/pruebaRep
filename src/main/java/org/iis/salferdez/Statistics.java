package org.iis.salferdez;

import java.util.List;

/** Class including some statistics methods for arrays of numbers */
public class Statistics {

  /**
   *
   * @param arrayOfNumbers
   * @return
   */
  public double maximumValue(double[] arrayOfNumbers) {
    if (arrayOfNumbers.length == 0) {
      throw new IllegalArgumentException("Array must not be empty");
    }
    double max = arrayOfNumbers[0];
    for (int i = 1; i < arrayOfNumbers.length; i++) {
      if (arrayOfNumbers[i] > max) {
        max = arrayOfNumbers[i];
      }
    }
    return max;
  }

  /**
   *
   * @param arrayOfNumbers
   * @return
   */
  public double minimumValue(double[] arrayOfNumbers) {
    if (arrayOfNumbers.length == 0) {
      throw new IllegalArgumentException("Array must not be empty");
    }
    double min = arrayOfNumbers[0];
    for (int i = 1; i < arrayOfNumbers.length; i++) {
      if (arrayOfNumbers[i] < min) {
        min = arrayOfNumbers[i];
      }
    }
    return min;
  }

  /**
   *
   * @param arrayOfNumbers
   * @return
   */
  public double mean(double[] arrayOfNumbers) {
    if (arrayOfNumbers.length == 0) {
      throw new IllegalArgumentException("Array must not be empty");
    }
    double sum = 0.0;
    for (double num : arrayOfNumbers) {
      sum += num;
    }
    return sum / arrayOfNumbers.length;
  }
}
