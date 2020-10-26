package com.looneycorn.linkedlist;

public class LinkedList<T extends  Comparable<T>> implements Cloneable {
    private Node<T> head = null;

    public LinkedList() {

    }

    public int countNodes() {
        if (head == null) {
            return 0;
        } else {
            Node<T> curr = head;
            int count = 0;
            while (curr != null ) {
                curr = curr.getNext();
                count++;
            }
            return count;
        }
    }
}
