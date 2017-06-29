package algorithms;


import dataStructures.graph.Graph;
import dataStructures.graph.Node;


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class GraphBSF {
    public int shortestDistance(Graph graph, Node node1, Node node2) {
        Queue<Node> nodes = new PriorityQueue<>();
        List<Node> visitedNodes = new ArrayList<>();
        nodes.add(node1);

        while (!nodes.isEmpty()) {
            Node currentNode = nodes.poll();
            System.out.println(currentNode.toString());

        }

        return 0;

    }

}

