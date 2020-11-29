import java.util.Objects;

public class List<T> {
	private Node head;
	private Node tail;
	private int size = 0;

	public List() {
		this.head = this.tail = null;
	}


	protected class Node {
		Node next = null;
		Node prev = null;
		T data;

		public Node() {

		}

		public Node(T value) {
			this.data = value;
		}

	}

	public void add(T data) {
		this.addTail(data);
	}

	public void add(int where, T data) {

		if(this.size < where ||  where < 0) {
			System.out.println("You are input wrong position. List size is " + size);
			return;
		}

		if(where == 0) {
			this.addHead(data);
			return;
		}

		if(where == this.size) {
			this.addTail(data);
			return;
		}

		Node newNode = new Node(data);
		Node current = head;
		for(int i = 0; i < where - 1; i++) {
			current = current.next;
		}

		newNode.next = current.next;
		newNode.prev = current;
		current.next = newNode;
		newNode.next.prev = newNode;
		this.size++;

	}

	protected void addTail(T data) {
		if(head == null) {
			head = new Node(data);
			tail = head;
		} else {
			Node newNode = new Node(data);
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}
		this.size++;

	}

	protected void addHead(T data) {
		if(head == null) {
			head = new Node(data);
			tail = head;
		} else {
			Node newNode = new Node(data);
			newNode.next = head;
			head.prev = newNode;
			head = newNode;	
		}
		this.size++;

	}


	public void delete(int position) {
		if(position >= this.size || position < 0) {
			System.out.println("You are input wrong position. List size is " + size);
			return;
		}
		if(position == 0) {
			this.delHead();
			return;
		}
		if(position == (this.size - 1)) {
			this.delTail();
			return;
		}

		Node current = head;
		for(int i = 0; i < position; i++) {
			current = current.next;
		}
		current.prev.next = current.next;
		current.next.prev = current.prev;
		current.prev = null;
		current.next = null;
		this.size--;
	}

	protected void delHead() {
		if(head == null)
			return;
		if(head.next == null) {
			tail = head = null;
		} else {
			head = head.next;
			head.prev.next = null;
			head.prev = null;
		}
		this.size--;
	}

	protected void delTail() {
		if(tail == null)
			return;
		if(tail.prev == null) {
			tail = head = null;
		} else {
			tail = tail.prev;
			tail.next.prev = null;
			tail.next = null;
		}
		this.size--;
	}

	public T get(int pos) {
		if(pos > this.size || pos < 0) {
			return head.data;
		}
		Node current = head;
		for(int i = 0; i < pos; i++) {
			current = current.next;
		}

		return current.data;
	}

	protected T getHead() {
		if(head != null) {
			return head.data;
		}
		return null;
	}

	protected T getTail() {
		if(tail != null) {
			return tail.data;
		}
		return null;
	}



	public int getSize() {
		return this.size;
	}

	public boolean isEmpty() {
		if(this.size == 0) {
			return true;
		} else {
			return false;
		}
	
	}

	public void print() {
		Node current = head;
		if(this.size == 0) {
			return;
		}
		while(current != null) {
			System.out.println(current.data + "");
			current = current.next;
		}
	}

	public void reversePrint() {
		Node current = tail;
		if(this.size == 0) {
			return;
		}
		while(current != null) {
			System.out.println(current.data + "");
			current = current.prev;
		}
	}



}


