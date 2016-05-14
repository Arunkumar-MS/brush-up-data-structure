package com.learn.sorting;


public class selectionSort extends sortHelper{

  public static void main(String[] args){
    System.out.println("Selection Sort");
    int[] input = {5,4,9,1,8};
    print(input, "Before Sort - ");

    selectionSort(input);
    print(input, "After Sort  - ");
  }

  public static void selectionSort(int[] input){
    for (int i = 0; i < input.length-1; i++) {

      int min = i;

      for (int j = i+1; j < input.length; j++) {

        if(input[j] < input[min]){
          min = j;
        }

      }
      swap(i, min, input);

    }
  }
}
