package org.example.task15;

/*Implement the merge sort algorithm for integer data in descending order.

To achieve that, you need to do 2 things:
- fill in the missing code in the public and private sort() method
- modify some code in the already implemented merge() method.

You also have the already-implemented less() and swap() methods at your disposal. You may use them if you want, or implement your own alternatives.

The merge() method is mostly implemented for you, but you might need to modify some things in it to implement descending sorting.*/

public class mergeSortDesc {
    //Solution
    public class MergeSort {

        /* Merge sort algorithm (public invocation) */
        public static void sort(int[] elements) {
            int[] aux = new int[elements.length];
            sort(elements, aux, 0, elements.length - 1);
        }

        /* Recursive merge sort logic */
        private static void sort(int[] elements, int[] aux, int low, int high) {
            if(high <= low){
                return;
            }

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
                } else if (greater(aux[j], aux[i])) {
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
        public static boolean greater(int v, int w) {
            return v > w;
        }

        /* Swaps the two elements in an array */
        public static void swap (int[] elements, int a, int b) {
            int tmp = elements[a];
            elements[a] = elements[b];
            elements[b] = tmp;
        }
    }
}
