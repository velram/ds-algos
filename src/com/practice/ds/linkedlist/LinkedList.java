package com.practice.ds.linkedlist;

public class LinkedList {

   LinkedListNode head;

   /**
    * Approach :
    * 1. Check for head is not null
    * 2. Check for next node is not empty
    * 3. Use temp variable for head access (don't access directly)
    * 4. Traverse till end of the list
    * 5. Print each node
    * @param head
    */
   public void printLinkedList(LinkedListNode head){

      LinkedListNode temp = head;
      while(temp != null){
         System.out.println(temp.data);
         temp = temp.next;
      }
   }

   /* Insert @ start
      Approach :
       Make the current head point to the new node

       Test cases :
        1. Empty linked list
        2. Single node linked list
        3. Incoming node is empty / null
    */
   public LinkedListNode insertAtStart(LinkedListNode head, int data){
      LinkedListNode newNode = new LinkedListNode(data);
      newNode.next = head;
      head = newNode;
      return head;
   }


}


