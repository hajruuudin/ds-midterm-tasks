package org.example.task08;

/*Implement the bubble sort algorithm for integer data by filling in the missing code in the sort() method.

You also have the already-implemented less() and swap() methods at your disposal. You may use them if you want, or implement your own alternatives.*/

public class bubbleSort {
    //Solution
    public class BubbleSort {
        static boolean swapped;

        /* Bubble sort algorithm */
        public static void sort(int[] elements) {
            for (int i = 0; i < elements.length; i++) {
                swapped = false;
                for (int j = 1; j < elements.length - i; j++) { // Corrected inner loop condition
                    if (elements[j - 1] > elements[j]) {
                        swap(elements, j - 1, j); // Corrected swapping indices
                        swapped = true;
                    }
                }

                if (!swapped) {
                    break;
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
        public static void swap(int[] elements, int a, int b) {
            int tmp = elements[a];
            elements[a] = elements[b];
            elements[b] = tmp;
        }
    }

}
