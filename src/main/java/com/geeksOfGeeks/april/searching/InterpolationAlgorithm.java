package com.geeksOfGeeks.april.searching;

public class InterpolationAlgorithm {
    public static void main(String[] args) {
        /**
         // The idea of formula is to return higher value of pos
         // when element to be searched is closer to arr[hi]. And
         // smaller value when closer to arr[lo]
         pos = lo + [ (x-arr[lo])*(hi-lo) / (arr[hi]-arr[Lo]) ]

         arr[] ==> Array where elements need to be searched
         x     ==> Element to be searched
         lo    ==> Starting index in arr[]
         hi    ==> Ending index in arr[]
         Algorithm
         Rest of the Interpolation algorithm is the same except the above partition logic.

         Step1: In a loop, calculate the value of “pos” using the probe position formula.
         Step2: If it is a match, return the index of the item, and exit.
         Step3: If the item is less than arr[pos], calculate the probe position of the left sub-array. Otherwise calculate the same in the right sub-array.
         Step4: Repeat until a match is found or the sub-array reduces to zero.

         Below is the implementation of algorithm.
         */
    }
}
