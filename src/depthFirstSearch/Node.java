package depthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
	private T data;
	private boolean visited;
	private List<Node<T>> childNodes;

	public Node(T data) {
		this.data = data;
		childNodes = new ArrayList<>();
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public boolean getVisited() {
		return this.visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Node<T>> getChildren() {
		return childNodes;
	}

	public void setChildren(List<Node<T>> childList) {
		this.childNodes = childList;
	}

	public void addChildNode(Node<T> child) {
		this.childNodes.add(child);
	}

	@Override
	public String toString() {
		return "" + this.data;
	}
}
