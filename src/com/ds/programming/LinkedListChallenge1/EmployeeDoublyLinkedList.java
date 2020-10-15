package com.ds.programming.LinkedListChallenge1;



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
        EmployeeNode node = new EmployeeNode(employee);
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
        EmployeeNode node = new EmployeeNode(employee);
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

    public EmployeeNode removeFromFront() {
        if(isEmpty()) {
            return null;
        }

        EmployeeNode removeNode = head;

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

    public EmployeeNode removeFromEnd() {
        if(isEmpty()) {
            return null;
        }

        EmployeeNode removeNode = tail;

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
        EmployeeNode current = head;
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

    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

        if(head == null) {
            return false;
        }

        //find the existing employee
        EmployeeNode current = head;
        while(current != null && !current.getEmployee().equals(existingEmployee)) {
            current = current.getNext();
        }

        if(current == null) {
            return false;
        }

        EmployeeNode newNode = new EmployeeNode(newEmployee);
        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);
        current.setPrevious(newNode);

        if(head == current) {
            head = newNode;
        }
        else {
            newNode.getPrevious().setNext(newNode);
        }

        size++;
        return true;
    }



}
