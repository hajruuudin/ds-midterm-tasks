package org.example.task13;

/*Implement the merge sort algorithm for integer data by filling in the missing code in the public and private sort() method.

You also have the already-implemented less() and swap() methods at your disposal. You may use them if you want, or implement your own alternatives.

Moreover, the merge() method is already implemented for you; no need to change it.*/

public class mergeSort {
    //Solution
    public class MergeSort {

        /* Merge sort algorithm (public invocation) */
        public static void sort(int[] elements) {
            int[] aux = new int[elements.length];
            int low = 0;
            int high = elements.length - 1;
            sort(elements, aux, low, high);
        }

        /* Recursive merge sort logic */
        private static void sort(int[] elements, int[] aux, int low, int high) {
            if(high <= low){
                return;
            };

            int middle = low + (high - low)/2;
            sort(elements, aux, low, middle);
            sort(elements, aux, middle + 1, high);
            merge(elements, aux, low, middle, high);
        }

        /* Merge the two sorted sub-arrays into a larger sorted (sub)array */
        private static void merge(int[] elements, int[] aux, int low, int mid, int high) {

            for (int k = low; k <= high; k++) {
                aux[k] = elements[k];
            }

            int i = low;
            int j = mid + 1;
            for (int k = low; k <= high; k++) {
                if (i > mid) {
                    elements[k] = aux[j++];
                } else if (j > high) {
                    elements[k] = aux[i++];
                } else if (less(aux[j], aux[i])) {
                    elements[k] = aux[j++];
                } else {
                    elements[k] = aux[i++];
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
