
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
}