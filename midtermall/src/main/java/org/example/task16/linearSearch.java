package org.example.task16;

/*Implement the sequential (linear) search algorithm by filling in the missing code in the search() method.

If an element (key) is found, you should return its index. If the element does not exist in the array, return -1.*/
public class linearSearch {
    //Solution
    public class SequentialSearch {
        /* Sequential search algorithm for integer arrays */
        public static int search(int[] elements, int key) {
            for(int i = 0; i < elements.length; i++){
                if(elements[i] == key){
                    return i;
                }
            }

            return -1;
        }
    }
}
