package test.collections;

class Node{
	public int value;
	public Node next;
}
public class LinkedListClass {
	public static void main(String[] args) {
		Node linkedList = new Node();
		linkedList.value = 1;

		Node linkedList2 = new Node();
		linkedList2.value = 2;

		Node linkedList3 = new Node();
		linkedList3.value = 3;

		Node linkedList4 = new Node();
		linkedList4.value = 4;


		linkedList.next = linkedList2;
		linkedList2.next = linkedList3;
		linkedList3.next = linkedList4;
		linkedList4.next = null;

		Node temp  = linkedList;

		temp.value = 5;
		
	}
}
