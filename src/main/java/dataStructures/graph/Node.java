package dataStructures.graph;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Node {
    private int nodeId;
    private List<Node> neighbours;

    public Node(int nodeId) {
        this.nodeId = nodeId;
    }


    public String toString() {
        return "Node(nodeId=" + this.getNodeId() +
                ", neighbours=" + this.getNeighbours() + ")";
    }

}
