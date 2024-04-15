package org.example.task18;

/*In this question, you are supposed to implement the cloneTail() operation for a queue.
The cloneTail() method should work like this:

if the queue is empty, the method does nothing
if there are elements on the queue, the method should duplicate / clone the tail element of the stack, and add it to the back of the queue
Example:

Queue<Integer> queue = new Queue<Integer>(); // new empty queue
queue.cloneTail(); // nothing happens
queue.enqueue(7);
queue.enqueue(1);
queue.enqueue(9);
queue.cloneTail(); // duplicate element 9 and add it to the tail of the queue

The queue now looks like:

7  1  9  9*/
public class cloneTail {
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

        /* Duplicate the tail item of the stack, and add it to the tail end of the queue */
        public void cloneTail() {
            if(isEmpty()){
                return;
            } else {
                // Create a new node with the same data as the tail
                Node<Item> duplicateTail = new Node<>();
                duplicateTail.data = tail.data;
                // Append the duplicated tail to the end of the queue
                tail.next = duplicateTail;
                tail = duplicateTail;
                size++;
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
