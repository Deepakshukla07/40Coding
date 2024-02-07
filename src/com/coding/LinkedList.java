package com.coding;

import sun.awt.image.ImageWatched;

public class LinkedList {

    Node  head;
    static class Node{
         int data;
         Node next;

         Node(int data){
             this.data=data;
             this.next=null;
         }
     }

     public static LinkedList insert( LinkedList list,int data){
         Node newNode= new Node(data);
         Node node= list.head;
         while (node.next!=null){
             node=node.next;
         }
         node.next=newNode;
         return list;
     }

     public  static  void printList(LinkedList list){
          Node currNode= list.head;
          while (currNode!=null){
              System.out.print(currNode.data);
              currNode=currNode.next;
          }
         System.out.println("->null");
     }




}
