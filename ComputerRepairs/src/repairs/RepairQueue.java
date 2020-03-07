package repairs;

public class RepairQueue {
	
	private DoublyLinkedListNode head;
	private DoublyLinkedListNode tail;
	
	
	
	public RepairQueue() {
		super();
		this.head = null;
		this.tail = null;
	}
	
	
	public boolean isEmpty(){
		if(head==null) {
			return true;
		}
		else
		{
			return false;
		}
	}	
	
	public boolean isFull()	{
		DoublyLinkedListNode temp= new DoublyLinkedListNode ();
		if(temp == null) {
			return true;
		}
		else
		{
			temp = null;
			return false;
		}
	}
	
	
	//Enqueue adds to back of the list
	
	public boolean enqueue(Computer data) {
		if(isFull()) {
			System.out.println("Unable to accept new jobs");
		}
		else {
				DoublyLinkedListNode nextItem = new DoublyLinkedListNode();
				nextItem.setData(data);
				
			if(isEmpty()) {
				head = nextItem;
				tail = nextItem;
			}
			else {
				nextItem.setPrev(tail);
				tail.setNext(nextItem);
				tail = nextItem;
			}
			return true;
		}
		return false;
	}

	
		
	//Dequeue deletes to front of the list
	
	public Computer dequeue() {
		Computer temp= head.getData();
		if(isEmpty() ) {
			System.out.println("List is empty");
		}
		else {
			DoublyLinkedListNode temp2 = head;
			if(head == tail) {
				head = null;
				tail = null;				
			}
			else 
			{
			head = head.getNext();
			head.setPrev(null);
			temp2 = null;
			}
		}
			return temp;

}
	
	
	public void destroy() {
				
		while(!isEmpty()) {
			dequeue();
		}
	}
	
	
}
