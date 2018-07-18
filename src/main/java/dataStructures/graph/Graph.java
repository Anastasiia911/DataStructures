package dataStructures.graph;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

@Setter
@ToString
@Getter

public class Graph {
    List<Node> allNodes;



    public void bsf() {
        Queue<Node> nodes = new LinkedBlockingQueue<>();
        List<Node> checkedNodes = new ArrayList<>();
        Node parent = allNodes.get(0);

        nodes.add(parent);
        checkedNodes.add(parent);

        while (!nodes.isEmpty()) {
            Node currentNode = nodes.poll();
            System.out.println(currentNode.toString());
            for (Node neighbour : currentNode.getNeighbours()) {
                if (!checkedNodes.contains(neighbour)) {
                    nodes.add(neighbour);
                    checkedNodes.add(neighbour);
                } else {
                    System.out.println("skip visited " + neighbour);
                }
            }
        }
    }
}
