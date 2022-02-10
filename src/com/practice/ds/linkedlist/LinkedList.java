package com.practice.ds.linkedlist;

public class LinkedList {

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

}


