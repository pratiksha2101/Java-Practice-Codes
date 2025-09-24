package com.demo1;

public class SinglyLinklist {
	
	//represent the head and tail of singly list
	public Node head=null;
	public Node tail=null;
	        //represent a node of the single list
	class Node{
		int data;
		Node next;
		   public Node(int data)
		   {
			   this.data= data; // data=30 next null
			   this.next=null;
		   }
	}
	
	//addNode() will add a new node to list
	
	
	    public void addNode(int data)// data=30
	    {
	    	Node newNode = new Node(data);
	    	//check if the list is empty
	    	if(head==null)
	    	{
	    		//if list is empty,both head and tail such that tails next will point to newNode
	    		head=newNode;
	    		tail=newNode;
	    	}
	    }
	    
	    public void show() {
	    	//node current will point to head
	    	
	    	Node current = head;
	    	
	    	if(head==null)
	    	{
	    		System.out.println("list is empty");
	    		return;
	    	}
	    	System.out.println(" node of singly list");
	    	
	    	while(current !=null)
	    	{
	    		//print each node by increment pointer
	    		System.out.println(current.data+" ");
	    		
	    		
	    		current = current.next;
	    	}
	    }

}
