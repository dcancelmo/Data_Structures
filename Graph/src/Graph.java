/*
 *Daniel Cancelmo
 *Lab 13
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 *This file includes code given by Prof. Pawlicki in the assignment files. Whole files skeleton is from Pawlicki. 'Meat' of methods is self written except when noted.
 */

public class Graph {
	
	//Instance variables given by Pawlicki
	private int vertexCount, edgeCount;
	boolean directed = false;
	private boolean adj[][];
	
	//constructor instantiates vlaues and adjacency array
	public Graph(int numVerticies, boolean isDirected) {
		directed = isDirected;
		vertexCount = numVerticies;
		adj =  new boolean[numVerticies][numVerticies];
	}
	
	//Getter methods
	public boolean isDirected() {
		return directed;
	}
	public int vertices() {
		return vertexCount;
	}
	public int edges() {
		return edgeCount;
	}
	
	//Inserts edge. If undirected makes adjacency array symmetrical. If directed inserts edge with e.v --> e.w
	public void insert(Edge e) {
		//Prevents duplicate inserts
		if (adj[e.v][e.w]) {
			System.out.println("Duplicate edge from " + e.v + " to " + e.w + " was not added.");
			return;
		}
		//Updates edge count
		edgeCount++;
		//Undirected graph
		if (isDirected() == true) {
			adj[e.v][e.w] = true;
		//Undirected graph
		} else {
			adj[e.v][e.w] = true;
			adj[e.w][e.v] = true;
		}
	}
	
	//Deletes edge. If undirected removes from adjacency array symmetrically. If directed deletes edge of e.v --> e.w
	public void delete(Edge e) {
		//Ends method if edge does not exist
		if (!adj[e.v][e.w] || !adj[e.w][e.v]) {
			System.out.println("Edge from " + e.v + " to " + e.w + " was not in the graph, no change made.");
			return;
		}
		//Updates edge count
		edgeCount--;
		//Undirected graph
		if (isDirected() == true) {
			adj[e.v][e.w] = false;
		//Undirected graph
		} else {
			adj[e.v][e.w] = false;
			adj[e.w][e.v] = false;
		}
	}
	
	//Informs user if an edge exists between node1 and node2. If undirected shows generally, if directed shows if edge exists from node1 --> node2
	public boolean connected(int node1, int node2) {
		return adj[node1][node2];
	}
	
	//Called by show() method to instantiate an AdjArray nested class
	public AdjList getAdjList(int vertex) { // your code here
		return new AdjArray(vertex);
	}
	
	//Method given by Pawlicki
	public void show() {
		for (int s = 0; s < vertices(); s++) {
			System.out.print(s + ": ");
			AdjList A = getAdjList(s);
			for (int t = A.begin(); !A.end(); t = A.next()) // use of iterator
				System.out.print(t + " ");
			System.out.println();
		} 
	}

	//Nested class used to iterate through the adjacency array
	private class AdjArray implements AdjList {
		private int v; // what vertex we are interested in
		private int i; // so we can keep track of where we are
		
		//Constructor
		public AdjArray(int v) {
		   this.v = v;
		   i = -1;
		}
		public int next() {
			for (++i ; i < vertices(); i++) {
				if (connected(v,i) == true) return i;
			}
			return -1;
		}
		public int begin() {
			i = -1;
			return next();
		}
		public boolean end() {
			return (i > vertices());
		} 
	}
}