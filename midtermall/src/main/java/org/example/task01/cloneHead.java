package org.example.task01;

/*
In this question, you are supposed to implement the cloneHead() operation for a queue.
The cloneHead() method should work like this:

if the queue is empty, the method does nothing
if there are elements on the queue, the method should duplicate / clone the head element of the stack, and add it to the back of the queue
Example:

Queue<Integer> queue = new Queue<Integer>(); // new empty queue
queue.cloneHead(); // nothing happens
queue.enqueue(7);
queue.enqueue(1);
queue.enqueue(9);
queue.cloneHead(); // duplicate element 7 and add it to the tail of the queue

The queue now looks like:

7  1  9  7
*/

public class cloneHead {
    public class Queue<Item> {

        /* Node implementation */
        private class Node <Item>{
            Item data;
            Node<Item> next;
        }

        private Node<Item> head = null;
        private Node<Item> tail = null;
        private int size = 0;

        /* Duplicate the head item of the stack, and add it to the tail end of the queue */
        public void cloneHead() {
            if(size == 0){
                return;
            }

            Node<Item> headCopy = new Node<Item>();
            headCopy = head;
            enqueue(headCopy.data);
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

        public Item dequeue() throws IndexOutOfBoundsException {
            if (isEmpty()) {
                throw new IndexOutOfBoundsException("Queue is empty.");
            }
            Item data = head.data;
            head = head.next;
            size--;
            if (isEmpty()) {
                tail = null;
            }
            return data;
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
