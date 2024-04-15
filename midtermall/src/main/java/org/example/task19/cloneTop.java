package org.example.task19;

/*In this question, you are supposed to implement the cloneTop() operation for a stack.

The cloneTop() method should work like this:

if the stack is empty, the method does nothing
if there are elements on the stack, the method should duplicate / clone the top element of the stack, and add it into the stack
Example:

Stack<Integer> stack = new Stack<Integer>(); // new empty stack
stack.cloneTop(); // nothing happens
stack.push(4);
stack.push(2);
stack.push(8);
stack.cloneTop(); // duplicate element 8, and add it to the stack

The stack now looks like:
8
8
2
4*/
public class cloneTop {
    //Solution
    public class Stack<Item> {

        /* Node implementation */
        private class Node <Item>{
            Item data;
            Node<Item> next;
        }

        private Node<Item> top = null;
        private int size = 0;

        /* Duplicate the top item of the stack, and add it into the stack */
        public void cloneTop() {
            if(isEmpty()){
                return;
            } else {
                Node<Item> cloneTop = new Node<>();
                cloneTop.data = top.data;
                cloneTop.next = top;
                top = cloneTop;
                size++;
            }
        }

        /* Push an item onto the stack */
        public void push(Item item) {
            Node<Item> newNode = new Node<Item>();
            newNode.data = item;
            newNode.next = top;
            top = newNode;
            size++;
        }

        public Item pop() {
            if (isEmpty()) {
                throw new IndexOutOfBoundsException("The stack is empty.");
            }
            Item item = top.data;
            top = top.next;
            size--;
            return item;
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
