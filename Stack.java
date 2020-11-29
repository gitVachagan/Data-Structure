public class Stack<T> extends List<T> {
	public Stack() {
		super();
	}

	public void push(T data) {
		addTail(data);
	}

	public T peek() {
		if(getTail() == null) {
			System.out.println("Stack is empty.");
			return null;
		}
		
		return getTail();
	}

	public T pop() {
		if(getTail() == null) {
			System.out.println("Stack is empty.");
			return null;
		}
		T temp = getTail();
		delTail();
		return temp;
	}

	public void print() {
		System.out.println("Stack size is " + getSize());
		super.reversePrint();
	}


	
}
