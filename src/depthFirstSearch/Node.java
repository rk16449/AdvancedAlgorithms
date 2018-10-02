package depthFirstSearch;

public class Node<T> {
	
	private T data;
	private boolean isVisited;
	
	public Node(T data){
		this.data = data;
	}
	
	public T getData(){
		return data;
	}
	
	public void setData(T data){
		this.data = data;
	}
	
	public boolean getVisited(){
		return isVisited;
	}
	
	public void setVisited(boolean isVisited){
		this.isVisited = isVisited;
	}
}
