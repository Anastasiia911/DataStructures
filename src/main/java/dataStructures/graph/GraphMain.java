package dataStructures.graph;


import com.sun.tools.javac.util.List;

import java.util.Arrays;

public class GraphMain {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);

        node1.setNeighbours(Arrays.asList(node2,node3));
        node2.setNeighbours(Arrays.asList(node4,node5,node1));
        node3.setNeighbours(Arrays.asList(node1,node6));
        node4.setNeighbours(Arrays.asList(node2,node7));
        node5.setNeighbours(Arrays.asList(node2,node7,node8));
        node6.setNeighbours(Arrays.asList(node8,node3));
        node7.setNeighbours(Arrays.asList(node4,node5));
        node8.setNeighbours(Arrays.asList(node6,node5));

        graph.setAllNodes(Arrays.asList(node1, node2, node3, node4, node5, node6, node7, node8));

        System.out.println(graph.toString());
    }
}
