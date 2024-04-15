package org.example.task12;

/*Implement the insertion sort algorithm for integer data by filling in the missing code in the sort() method.

You also have the already-implemented less() and swap() methods at your disposal. You may use them if you want, or implement your own alternatives.*/

public class insertionSort {
    //Solution
    public class InsertionSort {

        /* Insertion sort algorithm */
        public static void sort(int[] elements) {
            for(int i = 0; i < elements.length; i++){
                for(int j = i; j > 0; j--){
                    if(less(elements[j], elements[j-1])){
                        swap(elements, j, j - 1);
                    } else {
                        break;
                    }
                }
            }
        }

        /**
         * Helper methods.
         * No need to modify these two methods.
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
