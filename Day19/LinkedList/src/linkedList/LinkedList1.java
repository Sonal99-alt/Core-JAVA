package linkedList;

class Tester 
{
	static class Node
	{
		int data;
		Node next;
		public Node(int data) 
		{
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	Node tail = null;
	
	void addNodeAtLastPosition(int data)
	{
		Node n = new Node(data);
		
		if(head == null)
		{
			head = n;
			tail = n;
		}
		else
		{
			tail.next = n;
			tail = n;
		}
	}
	void addNodeAtFirstPosition(int data)
	{
		Node n = new Node(data);
		if(head == null)
		{
			head = n;
			tail = n;
		}
		else
		{
			n.next = head;
			head = n;
		}
	}
	
	void deleteNodeAtFirstPosition()
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			head = head.next;
		}
	}
	void deleteNodeAtLastPosition()
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else if(head.next == null)
		{
			head = null;
		}
		else
		{
			Node temp = head;
			while(temp.next.next != null)
			{
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	
	void display()
	{
		Node current = head;
		if(head == null)
		{
			System.out.println("No nodes to display");
		}
		while(current != null)
		{
			System.out.println(current.data+ " ");
			current = current.next;
		}
		System.out.println();
	}
}

public class LinkedList1
{
	public static void main(String args[])
	{
		Tester list = new Tester();
		
		list.addNodeAtLastPosition(2);
		list.addNodeAtLastPosition(5);
		list.addNodeAtLastPosition(55);
		list.addNodeAtLastPosition(8);
		
		list.display();
		
		list.addNodeAtFirstPosition(6);
		list.addNodeAtLastPosition(3);
		
		list.display();
		
		list.deleteNodeAtLastPosition();
		list.deleteNodeAtFirstPosition();
		
		list.display();
	}
}