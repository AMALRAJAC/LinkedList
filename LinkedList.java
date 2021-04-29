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
    public void insertDataAtFrond(int data) {
        Node node = new Node();
        node.data = data;
        node.nextNode = null;
        if (head != null) {
            node.nextNode = this.head;
            this.head = node;
            return;
        }
    }
    public void insertDataAtLast(int data) {
        Node node = new Node();
        node.data = data;
        node.nextNode = null;
        Node tempNode = this.head;
        while (tempNode.nextNode != null) {
            tempNode = tempNode.nextNode;
        }
        tempNode.nextNode = node;
    }
    public void insertDataIntoAnyPosition(int data,int index) {
        Node node = new Node();
        node.data = data;
        node.nextNode = null;
        Node current = this.head;
        Node previous = null;
        int i = 0;
        while (i < index) {
            previous = current;
            current = current.nextNode;
            i++;
        }
        node.nextNode = current;
        previous.nextNode = node;
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

        System.out.println("add data at the frond :");
        ls.insert(56);
        ls.print();
        ls.insert(70);
        ls.print();
        ls.insertDataIntoAnyPosition(30,1);
        ls.print();


    }
}