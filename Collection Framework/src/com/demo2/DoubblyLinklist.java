package com.demo2;



public class DoubblyLinklist {
    
     Node head,tail=null;
    
         class Node{
               
                 int data;
                 Node next;
                 Node Prev;
                 
                  
                     public Node(int data)   // 20
                     {
                          this.data=data;
                        
                    }
         }
         
         
         public void addNode(int data)
         {
                      Node newNode = new Node(data);  // obj -> 20 
                        
                      if(head== null) {
                             head=newNode;
                             tail=newNode;
                             head.Prev =null;
                             tail.next=null;
                             
                      }else
                      {
                             tail.next =newNode;
                             newNode.Prev =tail;
                             tail= newNode;
                             tail.next=null;
                      }
             
         }
         
         public void show()
         {
             // node currunt will point to head
         
            Node currunt = head;
            
             if(head==null) 
             {
                  System.out.println("list is empty");
                  return;
             }
             System.out.println(" node Of Doubly list");
             
             
             while(currunt !=null)
             {
                    //print each node by increment pointer
                 System.out.println(currunt.data+ " ");
                 
                 currunt = currunt.next;
                 
             }
            
     }     
         
         

}