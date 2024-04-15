package org.example.task11;

/*Implement the stack data structure by filling in the missing code in the following methods:

pop()
push()
isEmpty()
size()
The Node class and some starter code have already been implemented for you.*/

public class stack {
    //Solution
    public class Stack<Item> {

        /* Node implementation */
        private class Node <Item>{
            Item data;
            Node<Item> next;
        }

        private Node<Item> top = null;
        private int size = 0;

        /* Push an item onto the stack */
        public void push(Item item) {
            if(size == 0){
                Node<Item> newNode = new Node<>();
                newNode.data = item;
                top = newNode;
                size++;
            } else {
                Node<Item> newNode = new Node<>();
                newNode.data = item;
                newNode.next = top;
                top = newNode;
                size++;
            }
        }

        /* Check if the stack is empty */
        public boolean isEmpty() {
            return size == 0;
        }

        /* Remove the top item from the stack, and return its data */
        public Item pop() {
            Node<Item> holder = top;
            Node<Item> newTop = top.next;
            top.next = null;
            top = newTop;
            size--;

            return holder.data;
        }

        /* Return the current size of the stack */
        public int size() {
            return size;
        }
    }
}
