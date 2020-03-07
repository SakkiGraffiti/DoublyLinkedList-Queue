package repairs;

public class DoublyLinkedListNode {
	
	private Computer data;
	private DoublyLinkedListNode next;
	private DoublyLinkedListNode prev;
	
	
	public DoublyLinkedListNode() {
		next = null;
		prev = null;
	}


	public DoublyLinkedListNode(Computer data, DoublyLinkedListNode next, DoublyLinkedListNode prev) {
		super();
		this.data = data;
		this.next = next;
		this.prev = prev;
	}


	public DoublyLinkedListNode(DoublyLinkedListNode node) {
		super();
		this.data = node.data;
		this.next = node.next;
		this.prev = node.prev;
	}


	public Computer getData() {
		return data;
	}


	public void setData(Computer data) {
		this.data = data;
	}


	public DoublyLinkedListNode getNext() {
		return next;
	}


	public void setNext(DoublyLinkedListNode next) {
		this.next = next;
	}


	public DoublyLinkedListNode getPrev() {
		return prev;
	}


	public void setPrev(DoublyLinkedListNode prev) {
		this.prev = prev;
	}


	@Override
	public String toString() {
		return "DoublyLinkedListNode [data=" + data + ", next=" + next + ", prev=" + prev + "]";
	}

	
	public void display() {
		System.out.println(toString());
	}
		
		
}
