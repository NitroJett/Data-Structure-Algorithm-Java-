package LinkedList;

public class Node {

     int data;
     Node next;
     Node(int data){
    	 this.data=data;
    	 next=null;
     }
     public static void	main(String args[]) {
    	 Node head=new Node(10);
    	 head.next=new Node(20);
    	 head.next.next=new Node(30);
    	 head.next.next.next=new Node(40);
    	 printLL(head);
    	 recursiveLLFront(head);
    	 System.out.println();
    	 recursiveLLBack(head);
     }
     
	private static void recursiveLLBack(Node head) {
		// TODO Auto-generated method stub'
	     Node curr=head;
	     if(curr==null)
	    	 return;
	     recursiveLLBack(curr.next);
	     System.out.print(curr.data+" ");
		
	}
	private static void recursiveLLFront(Node head) {
		// TODO Auto-generated method stub
		Node curr=head;
		if(curr==null)
			return;
		System.out.print(curr.data+" ");
		recursiveLLFront(curr.next);
	}
	public static void printLL(Node head) {
		// TODO Auto-generated method stub
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}

}
