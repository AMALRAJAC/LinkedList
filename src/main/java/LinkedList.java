import java.util.Collections;

class LinkedList {
    static private Node head;
    class Node {
        int data;
        Node nextNode;
    }

    public void insertDataInToLinkedList(int data) {
        Node node = new Node();
        node.data = data;
        node.nextNode = null;
        if (this.head == null) {
            head = node;
            return;
        }
        Node tempNode = this.head;
        while (tempNode.nextNode != null) {
            tempNode = tempNode.nextNode;
        }
        tempNode.nextNode = node;
        sortList();
    }

    public void printDataInLinkedList() {
        if (this.head == null) {
            return;
        }
        Node tempNode = this.head;
        while (tempNode != null) {
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.nextNode;
        }
        System.out.println("NULL");
    }
    public boolean search(int searchValue){
        if(head.data==searchValue){
            printDataInLinkedList();
            System.out.println(searchValue+" found");
            return true;
        }
        Node current=this.head;
        while (current!=null){
            current=current.nextNode;
            if(current.data==searchValue){
                printDataInLinkedList();
                System.out.println(searchValue+" found");
                return true;
            }
        }
        return false;
    }
    public void addData(int data, int searchValue){
        Node node = new Node();
        node.data = data;
        node.nextNode = null;
        Node current = this.head;
        Node previous = null;
        if(head.data==searchValue){
            System.out.println(searchValue+" found");
            node.nextNode = current.nextNode;
            current.nextNode=node;
            sortList();
            printDataInLinkedList();
        }else {

            while (current != null) {
                previous = current;
                current = current.nextNode;
                if (current.data == searchValue) {
                    System.out.println(searchValue + " found");
                    break;
                }
            }

            node.nextNode = current.nextNode;
            previous.nextNode.nextNode = node;
            sortList();
            printDataInLinkedList();
        }
    }
    public int size(){
        int count=0;
        Node current=this.head;
        while(current!=null){
            current=current.nextNode;
            count++;
        }
        return count;

    }
    public void pop(int searchValue){
        Node current=this.head;
        Node previous=null;
        while (current!=null){
            previous=current;
            current=current.nextNode;
            if(current.data==searchValue){
                System.out.println(searchValue+" found");
                break;
            }
        }
        previous.nextNode=current.nextNode;
        printDataInLinkedList();

    }
    public void sortList() {
        //Node current will point to head
        Node current = this.head, previous = null;
        int temp;

        if(this.head == null) {
            return;
        }
        else {
            while(current != null) {
                //Node index will point to node next to current
                previous = current.nextNode;

                while(previous != null) {
                    //If current node's data is greater than index's node data, swap the data between them
                    if(current.data > previous.data) {
                        temp = current.data;
                        current.data = previous.data;
                        previous.data = temp;
                    }
                    previous = previous.nextNode;
                }
                current = current.nextNode;
            }
        }
        printDataInLinkedList();
    }
}