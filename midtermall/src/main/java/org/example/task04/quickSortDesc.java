package org.example.task04;
import java.util.Random;

/*Implement the quick sort algorithm for integer data in descending order.

To achieve that, you need to do 2 things:
- fill in the missing code in the public and private sort() method
- modify some code in the already implemented partition() method.

You also have the already-implemented less() and swap() methods at your disposal. You may use them if you want, or implement your own alternatives.

The partition() method is mostly implemented for you, but you might need to modify some things in it to implement descending sorting.
You do not need to modify the shuffle() method.*/

public class quickSortDesc {
    //Solution

    public class QuickSort {

        /* Quick sort algorithm (public invocation) */
        public static void sort(int[] elements) {
            shuffle(elements);
            sort(elements, 0, elements.length - 1);
        }

        /* Recursive quick sort logic */
        private static void sort(int[] elements, int low, int high) {
            if(high <= low){
                return;
            }

            int pivotIndex = partition(elements, low, high);
            sort(elements, low, pivotIndex - 1);
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
            int i = low + 1;
            int j = high;
            while (true) {
                while (i <= j && greater(elements[i], elements[low])) {
                    i++;
                }
                while (j >= i && !greater(elements[j], elements[low])) {
                    j--;
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
