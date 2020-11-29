public class Queue<T> extends List<T> {
	public Queue() {
		super();
	}

	public void add(T data) {
		addHead(data);
	}

	public T peek() {
		if(getTail() == null) {
			System.out.println("Queue is empty.");
			return null;
		}
		
		return getTail();
	}

	public T poll() {
		if(getTail() == null) {
			System.out.println("Queue is empty.");
			return null;
		}
		T temp = getTail();
		delTail();
		return temp;
	}

	public void remove() {
		super.delHead();

	}

	public void print() {
		System.out.println("Queue size is " + getSize());
		super.print();
	}

		
}
