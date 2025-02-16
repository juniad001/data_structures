package linkedList;

public class LinkedList {
	Node head;
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head == null) {
			head = node;
		}else {
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = node;
		}
	}
	public void insertAtStart(int data) {
		Node n = new Node();//amazing done
		n.data = data;
		n.next = null;
		n.next = head;
		head = n;
	}
	public void insertAt(int index,int data) {
		if(index == 0) {
			insertAtStart(data);
		}else {
			Node node = new Node();
			node.data = data;
			node.next = null;
			Node n = head;
			for(int i = 0;i<index-1;i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
			
		}
	}
	public void deleteAt(int index) {
		if(index == 0) {
			head = head.next;
		}else {
			Node n = head;
			Node n1;
			for(int i = 0;i<index-1;i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println("n1 is deleted "+n1.data);
		}
		
	}
	public void show() {
		Node
		node = head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}

