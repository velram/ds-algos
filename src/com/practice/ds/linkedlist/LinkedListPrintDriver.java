package com.practice.ds.linkedlist;


public class LinkedListPrintDriver {
    public static void main(String[] args) {

        LinkedListNode head = populateLinkedListHead();

        LinkedList linkedList = new LinkedList();
        linkedList.printLinkedList(head);

    }

    private static LinkedListNode populateLinkedListHead() {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode second = new LinkedListNode(2);
        LinkedListNode third = new LinkedListNode(3);
        LinkedListNode fourth = new LinkedListNode(4);

        head.next = second;
        head.next.next = third;
        head.next.next.next = fourth;

        return head;
    }
}
