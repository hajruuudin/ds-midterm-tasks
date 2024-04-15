package org.example.task05;

/*Implement the bubble sort algorithm for integer data, to sort the data in descending order, by filling in the missing code in the sort() method.

Example:

sort([6, 1, -3, 4, 2, 8]) --> [8, 6, 4, 2, 1, -3]

You also have the already-implemented less() and swap() methods at your disposal. You may use or modify them if necessary, or implement your own alternatives.*/

public class bubbleSortDesc {
    //Solution
    public class BubbleSort {

        static boolean swapped;

        /* Bubble sort algorithm (reverse sorting) */
        public static void sort(int[] elements) {


            for(int i = elements.length - 1; i >= 0; i--){
                swapped = false;

                for(int j = 1; j <= i; j++){
                    if(less(elements[j-1], elements[j])){
                        swap(elements, j, j-1);
                        swapped = true;
                    }
                }

                if(!swapped){
                    break;
                }
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
