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
        return "Node(nodeId=" + this.getNodeId()+")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        return nodeId == node.nodeId;
    }

    @Override
    public int hashCode() {
        return nodeId;
    }
}
