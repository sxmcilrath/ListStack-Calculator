package calc;
/**
 * list stack implementation
 * @author samuelmcilrath
 * @param <T>	Type for the stack. Will only be integer for this project
 */
public class ListStack<T> {
	
	//Nested Node class
	/**
	 * basic node class
	 * @author mac5p
	 */
	private class Node{
		private T item;
		private Node next;
		
		/**
		 * constructor
		 * @param item	item of next node
		 * @param next	next node
		 */
		public Node(T item, Node next) {
			this.item = item;
			this.next = next;
		}
	}
	
	private Node top;	//holds the top node in the stack
	
	/**
	 * constructor that creates empty list stack 
	 */
	public ListStack() {
		top = null;
	}
	
	/**
	 * creates new node and makes it the top of the list
	 * @param item	datum of the new top
	 */
	public void push(T item) {
		top = new Node(item, top);
	}
	
	/**
	 * pops of top node
	 * @return	either returns null if empty or returns the top of the stack
	 */
	public T pop() {
		if(isEmpty()) {
			return null;
		}
		
		T ret = top.item;
		top = top.next;
		return ret;
	}
	
	/**
	 * 
	 * @return datum of the top node
	 */
	public T peek() {
		return top.item;
	}
	
	/**
	 * @return returns if the list is empty
	 */
	public boolean isEmpty() {
		return top == null;
	}
	
}
