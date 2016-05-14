package com.learn.sorting;

/**
 * Created by rakeshnayak on 14/05/16.
 */
public class sortHelper {

  public static void print(int[] input) {
    for (int i : input) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void swap(int i, int j, int[] array) {
    int temp;
    temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
