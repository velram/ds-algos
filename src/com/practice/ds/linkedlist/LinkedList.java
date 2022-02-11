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

   /* Insert @ start - LinkedList (Singly LinkedList)
      Approach :
       Make the current head point to the new node

       Test cases :
        1. Empty linked list
        2. Single node linked list
        3. Incoming node is empty / null
    */
   public LinkedListNode insertAtStart(LinkedListNode head, int data){
      LinkedListNode newNode = new LinkedListNode(data);
      LinkedListNode temp = head;
      newNode.next = temp;
      head = newNode;
      return head;
   }

   /**
    * Delete @ Start - LinkedList (Singly LinkedList)
    * Approach :
    *  - Create temp node & assign head to it.
    *  - Fetch head.next and store it in head.
    *  - Make head.next as head.
    *  - now Point the temp.next to null
    *  - head.next as actual head
    *  - return head pointer
    *
    *  Edge cases -
    *   - Empty linked list
    *   - Single node in the list
    */

    public LinkedListNode deleteAtStart(LinkedListNode head){

       LinkedListNode temp = head;

       if(temp == null){
          System.out.println("Empty LinkedList can't be deleted");
          return null;
       }

       head = head.next; //Pointing new node as the head of the linkedList
       temp = null;
       System.gc();
       return head;
    }

}


