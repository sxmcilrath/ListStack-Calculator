package calc;

public class ListStack<T> {
	
	//Nested Node class
	/**
	 * 
	 * @author mac5p
	 *
	 */
	private class Node{
		private T item;
		private Node next;
		
		/**
		 * 
		 * @param item
		 * @param next
		 */
		public Node(T item, Node next) {
			this.item = item;
			this.next = next;
		}
	}
	
	private Node top;
	
	/**
	 * creates empty list stack 
	 */
	public ListStack() {
		top = null;
	}
	
	public void push(T item) {
		top = new Node(item, top);
	}
	
	/**
	 * 
	 * @return
	 */
	public T pop() {
		if(isEmpty()) {
			return null;
		}
		
		T ret = top.item;
		top = top.next;
		return ret;
	}
	
	public T peek() {
		return top.item;
	}
	
	/**
	 * 
	 * @return returns if the list is empty
	 */
	public boolean isEmpty() {
		return top == null;
	}
	
}
