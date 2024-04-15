package org.example.task10;

/*Implement the selection sort algorithm for integer data by filling in the missing code in the sort() method.

You also have the already-implemented less() and swap() methods at your disposal. You may use them if you want, or implement your own alternatives.*/

public class selectionSort {
    //Solution
    public class SelectionSort {

        /* Selection sort algorithm */
        public static void sort(int[] elements) {
            for(int i = 0; i < elements.length; i++){
                int min = i;
                for(int j = i; j < elements.length; j++){
                    if(less(elements[j], elements[min])){
                        min = j;
                    }
                }

                swap(elements, i, min);
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
