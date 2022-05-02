/**
 * @author Liyabona Saki
 * linkedList data structure implementation
 */

package cput.ac.za;

public class LinkedList {

    private Node head;							   //initializing our head


    public void InsertAtHead(String data) {               //Adding data
        if(head == null) {                         //test if the head is not empty/null
            head = new Node(data);                 //if empty / null create a new node for data
            return;
        }

        Node current  = head;
        while(current.getNext() != null) {
            current = current.getNext();           //keep moving until the end of the list
        }
        current.setNext(new Node(data));           //if end is reached create a new node/ data
    }


    public void insert(String data) {
        Node node  = new Node();
        node.setData(data);
        node.setNext(null);

        if(head == null) {
            head.setNext(node);
        }else {
            Node n = head;
            while(n.getNext() != null) {
                n = n.getNext();
            }
            n.setNext(node);
        }
    }

    public void deleteWithValue(String data) {
        if (head == null ) return;
        if(head.getData() == data) {
            head = head.getNext();
            return;
        }
        Node current  = head;
        while(current.getNext() != null) {
            if (current.getNext().getData() == data) {
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }

    public void show() {
        Node node = head;

        while(node.getNext() != null) {
            node = node.getNext();
            System.out.println(node.getData());
        }
//		System.out.println(node.getData());
    }

}
