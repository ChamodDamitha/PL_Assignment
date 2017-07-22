package LinkedList;

/**
 * Created by chamod on 7/22/17.
 */
public class LinkedList {
    private Node root;

    public LinkedList() {
        root = null;
    }

    /**
     * Insert a value to the linked list
     * a new node is created and attached ot the last node
     * @param value is the value to be insert
     */
    public void insert(int value){
        if(root == null){
            root = new Node(value, null);
        }
        else{
            Node node = root;
            while(node.getChild() != null){
                node = node.getChild();
            }
            node.setChild(new Node(value, node));
        }
    }

    /**
     * Search for the node with the value = {@code value}
     * @param value is the value to be searched
     * @return the node with the given, if value is not present return {@code null}
     */
    private Node searchNode(int value){
        Node node = root;
        while(node != null){
            if(node.getValue() == value){
                return node;
            }
            node = node.getChild();
        }
        return null;
    }

    /**
     * Check whether the given value is present in the linked list
     * @param value is the value to be searched
     * @return {@code true} if the value is present, {@code false} if the value is not present
     */
    public boolean search(int value){
        Node node = searchNode(value);
        if(node == null){
            return false;
        }
        return true;
    }


    /**
     * Print the values in the linked list from root to the last node seperated by commas
     */
    public void print(){
        Node node = root;
        while (node != null) {
            System.out.print(node.getValue() + ", ");
            node = node.getChild();
        }
        System.out.println();
    }

    /**
     * Edit the 1st occurrence of the value with the new value given
     * @param value is the value to be searched and edited
     * @param newValue is the new value to be replaced
     * @return {@code true} if the value could be edited, {@code false} if the value could
     * not be edited(value is not found)
     */
    public boolean edit(int value, int newValue){
        Node node = searchNode(value);

        if(node == null){
            return false;
        }
        else{
            node.setValue(newValue);
            return true;
        }
    }

    /**
     * Delete the 1st node found with the given value by joining the parent and child nodes of the node
     * @param value is the value to be searched and deleted
     * @return {@code true} if the value could be deleted, {@code false} if the value could
     * not be deleted(value is not found)
     */
    public boolean delete(int value){
        Node node = searchNode(value);

        if(node == null){
            return false;
        }
        else{
            node.getParent().setChild(node.getChild());
            node.getChild().setParent(node.getParent());
            return true;
        }
    }

    /**
     * Check whether the linked list is empty
     * @return
     */
    public boolean isEmpty(){
        if(root == null){
            return true;
        }
        return false;
    }

    /**
     * Find the number of elements in the linked list
     * @return
     */
    public int getSize(){
        int count = 0;
        Node node = root;
        while (node != null){
            count++;
            node = node.getChild();
        }
        return count;
    }

}
