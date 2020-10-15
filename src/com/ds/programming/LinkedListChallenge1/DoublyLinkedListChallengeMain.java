package com.ds.programming.LinkedListChallenge1;

public class DoublyLinkedListChallengeMain {
    public static void main(String[] args) {

        com.ds.programming.LinkedListChallenge1.Employee janeJones = new Employee("Jane","Jones",123);
        com.ds.programming.LinkedListChallenge1.Employee johnDoe = new Employee("John","Doe",4567);
        com.ds.programming.LinkedListChallenge1.Employee marySmith = new Employee("Mary","Smith",22);
        com.ds.programming.LinkedListChallenge1.Employee mikeWilson = new Employee("Mike","Wilson",3245);


        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());

        Employee billEnd = new Employee("Bill","End",78);
        list.addBefore(billEnd, johnDoe);

        list.printList();
        System.out.println(list.getSize());

        Employee someThingElse = new Employee("something","else",1111);
        list.addBefore(someThingElse, mikeWilson);

        list.printList();
        System.out.println(list.getSize());
    }
}
