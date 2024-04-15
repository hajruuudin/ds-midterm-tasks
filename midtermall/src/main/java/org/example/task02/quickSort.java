package org.example.task02;
import java.util.Random;

/*Implement the quick sort algorithm for integer data by filling in the missing code in the public and private sort() method.

You also have the already-implemented less() and swap() methods at your disposal. You may use them if you want, or implement your own alternatives.

Moreover, the partition() and shuffle() methods have already been implemented for you; no need to change anything there.*/

public class quickSort {
    //Solution:
    public class QuickSort {

        /* Quick sort algorithm (public invocation) */
        public static void sort(int[] elements) {
            shuffle(elements);
            int low = 0;
            int high = elements.length -1;
            sort(elements, low, high);
        }

        /* Recursive quick sort logic */
        private static void sort(int[] elements, int low, int high) {
            if(high <= low){
                return;
            };

            int pivotIndex = partition(elements, low, high);
            sort(elements, low, pivotIndex-1);
            sort(elements, pivotIndex + 1, high);
        }

        private static void shuffle(int[] elements) {
            Random rand = new Random();
            for (int i = 0; i < elements.length; i++) {
                int r = i + rand.nextInt(elements.length - i);

                int tmp = elements[r];
                elements[r] = elements[i];
                elements[i] = tmp;
            }
        }

        private static int partition(int[] elements, int low, int high) {
            int i = low;
            int j = high + 1;
            while (true) {
                while (less(elements[++i], elements[low])) {
                    if (i == high) {
                        break;
                    }
                }
                while (less(elements[low], elements[--j])) {
                    if (j == low) {
                        break;
                    }
                }
                if (i >= j) {
                    break;
                }
                swap(elements, i, j);
            }
            swap(elements, low, j);
            return j;
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
