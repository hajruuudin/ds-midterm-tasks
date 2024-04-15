package org.example.task14;

/*In this question, you are supposed to implement the peek() operation for a queue.

The peek() method should work like this:

if the queue is empty, the method should return null.
if there are elements in the queue, the method should return the first item in the queue, without removing it from the queue.
Example:

Queue<Integer> queue = new Queue<Integer>(); // new empty queue
queue.peek(); // null
queue.enqueue(7);
queue.enqueue(1);
queue.enqueue(9);
queue.peek(); // 7*/

public class peek {
    //Solution
    public class Queue<Item> {

        /* Node implementation */
        private class Node <Item>{
            Item data;
            Node<Item> next;
        }

        private Node<Item> head = null;
        private Node<Item> tail = null;
        private int size = 0;

        /* Return the first item from the queue, without removing it */
        public Item peek() {
            if(size == 0){
                return null;
            } else {
                return head.data;
            }
        }

        /* Add a new item to the queue */
        public void enqueue(Item item) {
            Node<Item> newNode = new Node<Item>();
            newNode.data = item;
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        /* Return the current size of the queue */
        public int size() {
            return size;
        }

        /* Check if the queue is empty */
        public boolean isEmpty() {
            return size == 0;
        }
    }
}
