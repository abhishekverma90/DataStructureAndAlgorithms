package com.ds.programming.doublylinkedlist;

import com.ds.programming.LinkedLists.Employee;

public class DoublyLinkedListMain {
    public static void main(String[] args) {

        com.ds.programming.LinkedLists.Employee janeJones = new com.ds.programming.LinkedLists.Employee("Jane","Jones",123);
        com.ds.programming.LinkedLists.Employee johnDoe = new com.ds.programming.LinkedLists.Employee("John","Doe",4567);
        com.ds.programming.LinkedLists.Employee marySmith = new com.ds.programming.LinkedLists.Employee("Mary","Smith",22);
        com.ds.programming.LinkedLists.Employee mikeWilson = new Employee("Mike","Wilson",3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());

        com.ds.programming.LinkedLists.Employee billEnd = new Employee("Bill","End",78);
        list.addToEnd(billEnd);

        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();

        list.printList();
        System.out.println(list.getSize());

        list.removeFromEnd();

        list.printList();
        System.out.println(list.getSize());

    }
}
