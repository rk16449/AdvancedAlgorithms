package depthFirstSearch;

import java.util.Stack;

public class DepthFirstSearch<T> {
	// Using a stack data structure
	private Stack<Node<T>> stack;
	
	public DepthFirstSearch(){
		this.stack = new Stack<>();
	}
	
	public void dfs(Node<T> root){
		
		stack.add(root);
		root.setVisited(true);
		
		while(!stack.isEmpty()){
			
			// grab the node
			Node<T> node = stack.pop();
			
			// Loop through its children
			for(Node<T> n : node.getChildren()){
				
				// check that we haven't visited this before
				if(!n.getVisited()){
					n.setVisited(true);
					// add to the stack
					stack.push(n);
				}
			}
		}
	}
}
