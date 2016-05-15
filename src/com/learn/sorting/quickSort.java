package com.learn.sorting;

/**
 * Goal:
 *  1. Heart of the algorithm is partition
 *  2. Every iteration will locate ane element into its correct position
 */

public class quickSort extends sortHelper{
  public static void main(String[] args) {
    int[] input = {5, 13, 4, 54, 7, 10, 2, 11};

    quickSort(input,0,input.length-1);
    print(input);
  }

  private static void quickSort(int[] input, int p, int r) {
    if(p<r){
      print(input);
      int q = Partition(input,p,r);
      quickSort(input,p,q-1);
      quickSort(input,q+1,r);
    }
  }

  private static int Partition(int[] A, int p, int r){
    int i=p-1;
    int value = A[r];
    for (int j = p; j < r; j++) {
      if(A[j] <= value){
        i = i+1;
        swap(i,j,A);
      }
    }
    swap(i+1,r,A);
    return i+1;
  }
}
