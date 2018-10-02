package unit.breadthSearchFirst;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import breadthSearchFirst.BreadthFirstSearch;
import breadthSearchFirst.Node;

public class BreadthSearchFirstTest {

	@Test
	public void testCreateBFS() {
	
		BreadthFirstSearch<Integer> bfs = new BreadthFirstSearch<Integer>();
		
		Node<Integer>[] nodes = new Node[10];
		
		// initialize nodes
		for(int i=0; i<nodes.length; i++){
			nodes[i] = new Node<Integer>(i);
		}
		
		// manually set up children
		nodes[0].addChildNode(nodes[1]);
		nodes[0].addChildNode(nodes[2]);
		nodes[0].addChildNode(nodes[3]);
		nodes[1].addChildNode(nodes[4]);
		nodes[1].addChildNode(nodes[5]);
		nodes[2].addChildNode(nodes[6]);
		nodes[3].addChildNode(nodes[7]);
		nodes[3].addChildNode(nodes[8]);
		nodes[4].addChildNode(nodes[9]);
		
		
		// do a bfs with root as nodes[0]
		List<Node<Integer>> searchedBFSList = bfs.bfs(nodes[0]);
		
		// convert both Lists into array of integers
		Node<Integer>[] nodeArray = searchedBFSList.toArray(new Node[searchedBFSList.size()]);
		int[] actualInts = new int[10];
		
		// get the ints from nodeArray
		for(int i=0; i<actualInts.length; i++){
			actualInts[i] = nodeArray[i].getData();
		}
		
		// the expected result we want
		int[] expectedArray = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		// check if array returned is searching in correct order
		assertArrayEquals(expectedArray, actualInts);
	}

}
