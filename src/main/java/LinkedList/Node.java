package LinkedList;

/**
 * Created by chamod on 7/22/17.
 */
public class Node {
    private int value;
    private Node child;
    private Node parent;

    public Node(int value, Node parent) {
        this.value = value;
        this.child = null;
        this.parent = parent;
    }

    public Node getChild(){
        return this.child;
    }

    public void setChild(Node node){
        this.child = node;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }


}
