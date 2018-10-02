package breadthSearchFirst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch<T> {

	public List<Node<T>> bfs(Node<T> root){
		
		List<Node<T>> order = new ArrayList<Node<T>>();
		
		// using a queue FIFO data structure
		Queue<Node<T>> queue = new LinkedList<>();
		
		// make sure we've set visited on root
		root.setVisited(true);
		
		// first data to be added is root
		queue.add(root);
		
		// save into 
		order.add(root);
		
		// while there is data on the queue
		while(!queue.isEmpty()){
			
			// remove the last queue
			Node<T> node = queue.remove(); 
			
			// print the node
			System.out.println(node + "");
			
			// loop through its children nodes
			for(Node<T> n : node.getChildren()){
				if(!n.getVisited()){
					// makes sure we don't re visit the same node
					n.setVisited(true);
					// add to the queue to check its children
					queue.add(n);
					// save into order
					order.add(n);
				}
			}
		} // end while
		
		return order;
	}
}
