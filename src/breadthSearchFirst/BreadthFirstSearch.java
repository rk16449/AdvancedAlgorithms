package breadthSearchFirst;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<T> {

	public void createBFS(Node<T> root){
		// using a queue FIFO data structure
		Queue<Node<T>> queue = new LinkedList<>();
		
		// make sure we've set visited on root
		root.setVisited(true);
		
		// while there is data on the queue
		while(!queue.isEmpty()){
			
			// remove the last queue
			Node<T> node = queue.remove(); 
			
			// print the node
			System.out.println(node);
			
			// loop through its children nodes
			for(Node<T> n : node.getChildren()){
				if(!n.getVisited()){
					// makes sure we don't re visit the same node
					n.setVisited(true);
					// add to the queue to check its children
					queue.add(n);
				}
			}
		}
	}
}
