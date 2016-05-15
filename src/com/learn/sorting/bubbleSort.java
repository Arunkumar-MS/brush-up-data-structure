package com.learn.sorting;

/**
 * Goal:
 *  1. At the end of one iteration the biggest element is at the end of the array
 *  2. We will continue until we sort the array
 *
 * Disadvantage:
 *  1. Worst Performance
 *  2. Time Complexity O(n to power 2)
 */

public class bubbleSort extends sortHelper {

  public static void main(String[] args) {
    System.out.println("Bubble Sort");

    int[] input = {5, 13, 54, 4, 7, 10, 34, 11};
    System.out.println("By Book");
    bubbleSort_Book(input);
    print(input);

    int[] input1 = {5, 13, 54, 4, 7, 10, 34, 11};
    System.out.println("By Me");
    bubbleSort(input1);
    print(input1);



  }
  private static void bubbleSort_Book(int[] A) {
    for (int pass = A.length-1; pass >=0; pass--) {
      for (int i=0; i <= pass-1;i++){
        if (A[i] > A[i+1]) {
          swap(i, i+1, A);
        }
      }
      print(A);

    }
  }

  private static void bubbleSort(int[] input) {
    for (int i = 0; i < input.length-1; i++) {
      for (int j=0; j < input.length-1;j++){

        if (input[j] > input[j+1]) {
          swap(j, j+1, input);
        }

      }
      print(input);
    }
  }
}
