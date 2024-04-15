package org.example.task20;

/*Implement the insertion sort algorithm for integer data, to sort the data in descending order, by filling in the missing code in the sort() method.

Example:

sort([7, -2, 3, 6, 12, 5]) --> [12, 7, 6, 5, 3, -2]

You also have the already-implemented less() and swap() methods at your disposal. You may use or modify them if necessary, or implement your own alternatives.*/
public class insertionSortDesc {
    //Solution
    public class InsertionSort {

        /* Insertion sort algorithm (reverse sorting) */
        public static void sort(int[] elements) {
            for(int i = elements.length - 1; i >= 0; i--){
                for(int j = i; j < elements.length - 1; j++){
                    if(less(elements[j], elements[j+1])){
                        swap(elements, j, j + 1);
                    } else {
                        break;
                    }
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
