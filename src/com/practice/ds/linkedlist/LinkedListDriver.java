package com.practice.ds.linkedlist;


public class LinkedListDriver {
    public static void main(String[] args) {

        LinkedListNode head = populateLinkedListHead();
        LinkedListNode firstNode = new LinkedListNode(0);

        //Exected output : 1 -> 2 -> 3 -> 4
        LinkedList linkedList = new LinkedList();
        linkedList.printLinkedList(head);

        //Exected output : 0 -> 1 -> 2 -> 3 -> 4
        // (Refer line #10 for prev state of LinkedList)
        LinkedListNode result = linkedList.insertAtStart(head, 0);
        System.out.println("\n LinkedList after insertion @ start");
        linkedList.printLinkedList(result);
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
