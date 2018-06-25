public class NodeImpl<V> {
	private Node head;
	private Node tail;

	public void addBack(V value) {
		Node currentNode = new Node();
		currentNode.setValue(value);
		if (head == null) {
			head=currentNode;
			tail = head;
		}
		currentNode.setPrev(tail);
		tail.setNext(currentNode);

	}
}
