package com.practiceProblem;


import java.util.Scanner;

class LinkedList {

    static private Node head;

    class Node {
        int data;
        Node nextNode;
    }

    // {
    public void insert(int data) {
        //create a new Node and store a data.
        Node node = new Node();
        node.data = data;
        node.nextNode = null;

        //check the head is null or not.
        //if head is null, assign the Node and exit.
        if (this.head == null) {
            head = node;
            return;
        }

        //assign a head into the temp Node and loop it until find the null reference.
        Node tempNode = this.head;
        while (tempNode.nextNode != null) {
            tempNode = tempNode.nextNode;
        }

        //assign new node.
        tempNode.nextNode = node;
    }
    public void print() {
        if (this.head == null) {
            return;
        }
        //print all nodes
        Node tempNode = this.head;
        while (tempNode != null) {
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.nextNode;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {
        LinkedList ls = new LinkedList();

        ls.insert(56);
        ls.insert(30);
        ls.insert(70);
        System.out.println("simple linkedList :");
        ls.print();

    }
}