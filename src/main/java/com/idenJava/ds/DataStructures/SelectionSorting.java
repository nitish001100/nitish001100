package com.idenJava.ds.DataStructures;

public class SelectionSorting {

    void selectionSort(int[]arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
    
    public static void main(String[] args) {
        int[]arr = new int[]{5,1,12,-5,16,2,12,14};
        SelectionSorting selectionSorting = new SelectionSorting();
        selectionSorting.selectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}
