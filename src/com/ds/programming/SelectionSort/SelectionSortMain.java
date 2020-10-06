package com.ds.programming.SelectionSort;

public class SelectionSortMain {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7 , 55, 1, -22};

        for(int lastUnSortedIndex = intArray.length-1; lastUnSortedIndex > 0; lastUnSortedIndex--) {

            int largest = 0;
            for(int i = 1; i<= lastUnSortedIndex;i++ ) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray,largest,lastUnSortedIndex);
        }

        for(int i = 0; i<intArray.length;i++) {
            System.out.println(intArray[i]);
        }
    }

    private static void swap(int[] intArray,int i,int j) {

        if(i == j) {
            return;
        }

        int temp;
        temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;

    }
}
