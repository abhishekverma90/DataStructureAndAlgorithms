package com.ds.programming.InsertionSort;

public class InsertionSortMain {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15,7 ,55, 1, -22};

        for(int firstUnSortedIndex = 1;firstUnSortedIndex < intArray.length;firstUnSortedIndex++) {
            int newElement = intArray[firstUnSortedIndex];

            int i;

            for(i = firstUnSortedIndex; i> 0 && intArray[i-1] > newElement;i--) {
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }

        for(int i = 0; i< intArray.length;i++) {
            System.out.println(intArray[i]);
        }
    }
}
