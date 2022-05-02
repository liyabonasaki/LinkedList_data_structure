/**
 * @author Liyabona Saki
 * linkedList data structure implementation
 */

package cput.ac.za;

public class Node {                                // Creating class cput.ac.za.Node

    private Node next;                             // class property
    private String data;                              // class property


    public Node() {                                // Default con

    }

    public Node(String data ) {                        // Argument constructor
        this.data = data;

    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
