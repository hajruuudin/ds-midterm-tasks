package org.example.task09;

/*In this question, you are supposed to implement the peek() operation for a stack.

The peek() method should work like this:

if the stack is empty, the method should return null.
if there are elements on the stack, the method should return the top-most item from the stack, without removing it from the stack.
Example:

Stack<Integer> stack = new Stack<Integer>(); // new empty stack
stack.peek(); // null
stack.push(4);
stack.push(2);
stack.push(8);
stack.peek(); // 8

You do not need to modify any other parts of the code.*/

public class peek {
    //Solution
    public class Stack<Item> {

        /* Node implementation */
        private class Node <Item>{
            Item data;
            Node<Item> next;
        }

        private Node<Item> top = null;
        private int size = 0;

        /* Return the top-most item from the stack, without removing it */
        public Item peek() {
            if(size == 0){
                return null;
            };

            return top.data;
        }

        /* Push an item onto the stack */
        public void push(Item item) {
            Node<Item> newNode = new Node<Item>();
            newNode.data = item;
            newNode.next = top;
            top = newNode;
            size++;
        }

        /* Return the current size of the stack */
        public int size() {
            return size;
        }

        /* Check if the stack is empty */
        public boolean isEmpty() {
            return size == 0;
        }
    }
}
