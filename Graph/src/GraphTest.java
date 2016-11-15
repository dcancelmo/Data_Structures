/*
 *Daniel Cancelmo
 *Lab 13
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

public class GraphTest {
	
	public static void main(String[] args) {
		//Graph 9.10 x1 = node 1 x7 = node 7 and so forth
		//Written as value -1 instead of just typing in one less because I wanted to call x1 node 1, but to work with this program, all vlaues had to be shifted down 1
		Graph graph910 = new Graph(7, true);
		graph910.insert(new Edge(1-1,2-1));
		graph910.insert(new Edge(2-1,5-1));
		graph910.insert(new Edge(5-1,7-1));
		graph910.insert(new Edge(7-1,6-1));
		graph910.insert(new Edge(6-1,3-1));
		graph910.insert(new Edge(3-1,1-1));
		graph910.insert(new Edge(1-1,4-1));
		graph910.insert(new Edge(2-1,4-1));
		graph910.insert(new Edge(4-1,5-1));
		graph910.insert(new Edge(4-1,7-1));
		graph910.insert(new Edge(4-1,3-1));
		graph910.insert(new Edge(4-1,6-1));
		System.out.println("Graph 9.10 is directed: " + graph910.isDirected() + "\n\thas " + graph910.vertices() + " vertices.\n\thas " + graph910.edges() + " edges.");
		System.out.println("Graph 9.10 has node 5 directing to node 7: " + graph910.connected(5-1, 7-1));
		System.out.println("Graph 9.10 has node 7 directing to node 5: " + graph910.connected(7-1, 5-1));
		System.out.println("Adjacency Array shown below:");
		graph910.show();
		graph910.delete(new Edge(5-1,7-1));
		System.out.println("Edge from node5 to node7 has been deleted.");
		System.out.println();
		
		//Graph 9.62 A = node 1 E = node 5 and so forth
		Graph graph962 = new Graph(5, false);
		graph962.insert(new Edge(0,4));
		graph962.insert(new Edge(4,2));
		graph962.insert(new Edge(2,1));
		graph962.insert(new Edge(1,0));
		graph962.insert(new Edge(3,0));
		graph962.insert(new Edge(3,1));
		graph962.insert(new Edge(3,2));

		System.out.println("Graph 9.62 is directed: " + graph962.isDirected() + "\n\thas " + graph962.vertices() + " vertices.\n\thas " + graph962.edges() + " edges.");
		System.out.println("Graph 9.62 has node A (0) directing to node D (3): " + graph962.connected(0, 3));
		System.out.println("Graph 9.62 has node E (4) directing to node D (3): " + graph962.connected(4, 3));
		System.out.println("Adjacency Array shown below:");
		graph962.show();
		graph962.delete(new Edge(4,2));
		System.out.println("Edge from node4 to node2 has been deleted.");
	}
	
}
