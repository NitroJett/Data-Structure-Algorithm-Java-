package LinkedList;
public class TraversalOfLinkedList extends Node{
	TraversalOfLinkedList(int data) {
		super(data);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Node head=new Node(10);
      head.next=new Node(20);
      head.next.next=new Node(30);
      
      print(head);
           
	}
	public static void print(Node head) {
		// TODO Auto-generated method stub
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}	
	}

}
