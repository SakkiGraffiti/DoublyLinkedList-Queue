package repairs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RepairQueue queue = new RepairQueue ();
		
		//adding to back
		for(int i =1; i<5; i++) {
			queue.enqueue(new Computer(i, "Problem"+ (i), i*500.0F));
		}
		
		//deleting from front
		for(int i =1; i<5; i++) {
		 Computer deletedItem = queue.dequeue();
		 if(deletedItem != null) {
			 System.out.println("Dequeued");
			 deletedItem.display();
			 
		 }
	}
	
	queue.destroy();
	System.out.println("List is empty");
	

	}
}
