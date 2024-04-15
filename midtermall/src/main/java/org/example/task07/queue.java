package org.example.task07;

/*Implement the queue data structure by filling in the missing code in the following methods:

enqueue()
dequeue()
isEmpty()
size()
The Node class and some starter code have already been implemented for you.*/

public class queue {
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

        /* Add new item to the back of the queue */
        public void enqueue(Item item) {
            Node<Item> newOne = new Node<>();
            newOne.data = item;
            newOne.next = null; // Since this is the last node, its next should be null

            // If the queue is empty, set both head and tail to the new node
            if (isEmpty()) {
                head = newOne;
                tail = newOne;
            } else {
                tail.next = newOne; // Link the current tail to the new node
                tail = newOne; // Update tail to the new node
            }
            size++;
        }

        /* Check if the queue is empty */
        public boolean isEmpty() {
            return size == 0;
        }

        /* Removes an item from the front of the queue, and returns its data */
        public Item dequeue() {

            Node<Item> dequeued = head; // Store the node to be dequeued
            head = head.next; // Move head to the next node
            size--; // Decrease size
            // If after dequeueing, the queue becomes empty, also update tail to null
            if (isEmpty()) {
                tail = null;
            }
            return dequeued.data; // Return the data of the dequeued node
        }

        /* Return the current size of the queue */
        public int size() {
            return size;
        }
    }
}
