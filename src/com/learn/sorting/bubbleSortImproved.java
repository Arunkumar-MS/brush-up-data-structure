package com.learn.sorting;

/**
 * Goal:
 *  1. At the end of one iteration the biggest element is at the end of the array
 *  2. We will continue until we sort the array
 *  3. Its stops iterating when swapped is false to get rid of unnecessary iterating
 *
 * Disadvantage:
 *  1. Worst Performance
 *  2. Time Complexity O(n to power 2)
 */

public class bubbleSortImproved extends sortHelper{
  public static void main(String args[]){
    System.out.println("Bubble Sort - Improved");
    int[] input = {5, 13, 54, 4, 7, 10, 34, 11,12};;

    System.out.println();
    bubbleSortImproved(input);
    print(input);
  }

  public static void bubbleSortImproved(int[] input){
    for (int i = 0; i < input.length; i++) {
      boolean swapped = false;

      System.out.println();
      System.out.print(i + " Loop - ");
      print(input);

      for (int j = 0; j < input.length-(i+1); j++) {
        System.out.print("  " + j + " Inner Loop - ");
        print(input);
        if(input[j] > input[j+1]){
          swap(j,j+1, input);
          System.out.print("  " + j + " Swap Loop  - ");
          print(input);
          swapped=true;
        }
      }
      if(!swapped){
        break;
      }
    }
  }
}
