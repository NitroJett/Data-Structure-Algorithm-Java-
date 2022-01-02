package LinkedList;

public class InsertionAtTheBegin extends Node{

	
	InsertionAtTheBegin(int data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head=insertAtBegin(head,5);
        printLL(head);
	}

public static Node insertAtBegin(Node head,int d) {
		// TODO Auto-generated method stub
	    if(head==null)
	    {
	    	Node temp=new Node(d);
	    	temp.next=null;
	    	head=temp;
	    }else {
	    	Node temp=new Node(d);
	    	temp.next=head;
	    	head=temp;
	    }
	    
	    
	    return head;
	}

}
