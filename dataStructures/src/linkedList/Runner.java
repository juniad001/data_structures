package linkedList;


public class Runner {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(18);
		list.insert(45);
		list.insert(12);
		list.insert(14);
		list.insert(18);
		list.insertAtStart(11);
		list.insertAt(3, 13);
		list.deleteAt(3);
		list.show();
	}
}
