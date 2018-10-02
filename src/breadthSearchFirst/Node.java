package breadthSearchFirst;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
	private T data;
	private boolean visited;
	private List<Node> childNodes; 
	
	public Node(T data){
		this.data = data;
		childNodes = new ArrayList<Node>();
	}
}
