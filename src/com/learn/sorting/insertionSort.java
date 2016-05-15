package com.learn.sorting;


/**
 * Goal:
 *  1. Every iteration removes an element from input data and inserts into the correct position in already sorted array
 *
 * Disadvantage:
 *  1. Worst Performance
 *  2. Time Complexity O(n to power 2)
 */


public class insertionSort extends sortHelper {
  public static void main(String[] args) {
    System.out.println("Insertion Sort");

    int[] input = {5, 13, 4, 54, 7, 10, 2, 11};

    insertionSort(input);

    print(input);
  }

  private static void insertionSort(int[] A) {
    int i,key;
    for (i = 1; i < A.length; i++) {
      key = i;
      int value = A[i];
      System.out.println("key = " + value);

      while (key > 0 && A[key-1] > value) {
        A[key] = A[key-1];
        key--;
        print(A,"Inner Loop ");
      }
      A[key] = value;
      print(A);
    }
  }
}

