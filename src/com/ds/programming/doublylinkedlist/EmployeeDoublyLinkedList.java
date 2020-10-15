package com.ds.programming.doublylinkedlist;

import com.ds.programming.LinkedLists.Employee;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public EmployeeNode getHead() {
        return head;
    }

    public void setHead(EmployeeNode head) {
        this.head = head;
    }

    public EmployeeNode getTail() {
        return tail;
    }

    public void setTail(EmployeeNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addToFront(Employee employee) {
        com.ds.programming.doublylinkedlist.EmployeeNode node = new com.ds.programming.doublylinkedlist.EmployeeNode(employee);
        node.setNext(head);

        if(head == null) {
            tail = node;
        }
        else {
            head.setPrevious(node);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        com.ds.programming.doublylinkedlist.EmployeeNode node = new com.ds.programming.doublylinkedlist.EmployeeNode(employee);
        if(tail == null) {
            head = node;
        }
        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public com.ds.programming.doublylinkedlist.EmployeeNode removeFromFront() {
        if(isEmpty()) {
            return null;
        }

        com.ds.programming.doublylinkedlist.EmployeeNode removeNode = head;

        if(head.getNext() == null) {
            tail = null;
        }
        else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public com.ds.programming.doublylinkedlist.EmployeeNode removeFromEnd() {
        if(isEmpty()) {
            return null;
        }

        com.ds.programming.doublylinkedlist.EmployeeNode removeNode = tail;

        if(tail.getPrevious() == null) {
            head = null;
        }
        else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removeNode.setPrevious(null);
        return removeNode;
    }

    public void printList() {
        com.ds.programming.doublylinkedlist.EmployeeNode current = head;
        System.out.print("HEAD ->");
        while(current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return head == null;
    }



}
