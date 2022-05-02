/**
 * @author Liyabona Saki
 * linkedList data structure implementation
 */

package cput.ac.za;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        System.out.println("Inserting elements\n");
        list.InsertAtHead("c++");
        list.insert("Java");
        list.insert("Python");
        list.insert("php");
        list.insert("dotnet");
        list.insert("ruby");
        list.insert("bash");
        list.insert("scala");

        list.show();

        System.out.println("\nDeleting elements\n");

        // Delete
        list.deleteWithValue("Python");
        list.deleteWithValue("ruby");

        // Printing out our data
        list.show();

    }

}

