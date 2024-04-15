package org.example.task06;

/*Implement the selection sort algorithm for integer data, to sort the data in descending order, by filling in the missing code in the sort() method.

Example:

sort([9, 1, -3, 4, 11, 8]) --> [11, 9, 8, 4, 1, -3]

You also have the already-implemented less() and swap() methods at your disposal. You may use or modify them if necessary, or implement your own alternatives.*/

public class selectionSortDesc {
    //Soluton
    public class SelectionSort {

        /* Selection sort algorithm (reverse sorting) */
        public static void sort(int[] elements) {
            for(int i = 0; i < elements.length-1; i++){
                int max = i;
                for(int j = i+1; j < elements.length; j++){
                    if(elements[j]>elements[max]){
                        max = j;
                    }
                }

                swap(elements, i, max);
            }
        }

        /**
         * Helper methods.
         * You may modify them if necessary, or implement your own alternatives.
         */

        /* Returns whether the first element is less than the second one */
        public static boolean less(int v, int w) {
            return v < w;
        }

        /* Swaps the two elements in an array */
        public static void swap (int[] elements, int a, int b) {
            int tmp = elements[a];
            elements[a] = elements[b];
            elements[b] = tmp;
        }
    }
}
