Daniel Cancelmo
Lab 13
CSC 172 - Professor Pawlicki
Lab: Mon. & Wed. 12:30-1:45 | TAs: Willie Cohen & JP Castano
I did not collaborate with anyone on this assignment.
ReadMe File

Contact info:
dcancelm@u.rochester.edu

This lab is on Graphs. It is Lab 13 for CSC 172 with Professor Pawlicki.
‘Graph.java' contains the code for the required functions of a graph. This includes: constructors, insert, delete, connected, getAdjList, show, and getters for directed, vertexCount, and edgeCount. It also contains a nested class “AdjArray” that serves as an iterator through the adjacency array.
‘Edge.java’ creates instances of an edge given two values v, w. For undirected the edge is treated as both ways. For directed it is treated as v —-> w.
‘AdjList.java’ contains an interface for the nested class ‘AdjArray’ in ‘Graph.java’.
‘GraphTest.java’ tests all of these methods.
This is done using two graphs given by Pawlicki: Graph 9.10 and Graph 9.62.
Node x1 becomes value zero and so forth. Node A becomes value zero and so forth.
For 9.10 x1 is typed in as 1-1 for the sake of identifying it as x1. The original values are all typed in followed by a -1 on all values to shift them down.


Included are four java source files ‘Graph.java', ‘GraphTest.java', ‘Edge.java’, and ‘AdjList.java' already described above. 

In addition there is a text file titled 'OUTPUT.txt' that shows what is printed to the console when “GraphTest.java” is ran.