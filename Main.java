public class Main {

	public static void main(String[] args) {
		List<Integer> list = new List<>();

		Stack<String> stack = new Stack<>();

		stack.push("first");
		stack.push("second");
		stack.push("third");
		stack.push("fourth");
		stack.push("fifth");
		System.out.println("------------------------------------------");
		stack.print();
		System.out.println("------------------------------------------");

		System.out.println("pop stack --> " + stack.pop());
		System.out.println("pop stack --> " + stack.pop());
		System.out.println("peek stack --> " + stack.peek());
		System.out.println("------------------------------------------");
		stack.print();
		System.out.println("------------------------------------------");

		
		Queue<Integer> queue = new Queue<>();

		queue.add(1);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(5);
		queue.add(8);
		queue.add(13);
		System.out.println("------------------------------------------");
		queue.print();
		System.out.println("------------------------------------------");
		
		
		System.out.println("poll queue --> " + queue.poll());
		System.out.println("poll queue -->" + queue.poll());
		System.out.println("peek queue --> " + queue.peek());
		System.out.println("------------------------------------------");
		queue.print();
		System.out.println("------------------------------------------");
	
	}
}

