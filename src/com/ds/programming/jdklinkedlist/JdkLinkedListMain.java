package com.ds.programming.jdklinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class JdkLinkedListMain {
    public static void main(String[] args) {

        com.ds.programming.jdklinkedlist.Employee janeJones = new com.ds.programming.jdklinkedlist.Employee("Jane","Jones",123);
        com.ds.programming.jdklinkedlist.Employee johnDoe = new com.ds.programming.jdklinkedlist.Employee("John","Doe",4567);
        com.ds.programming.jdklinkedlist.Employee marySmith = new com.ds.programming.jdklinkedlist.Employee("Mary","Smith",22);
        com.ds.programming.jdklinkedlist.Employee mikeWilson = new com.ds.programming.jdklinkedlist.Employee("Mike","Wilson",3245);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while(iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        Employee billEnd = new com.ds.programming.jdklinkedlist.Employee("Bill","End",78);
        list.add(billEnd);
        Iterator iter1 = list.iterator();
        System.out.print("HEAD -> ");
        while(iter1.hasNext()) {
            System.out.print(iter1.next());
            System.out.print("<=>");
        }
        System.out.println("null");


        list.removeFirst();
        Iterator iter2 = list.iterator();
        System.out.print("HEAD -> ");
        while(iter2.hasNext()) {
            System.out.print(iter2.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.removeLast();
        Iterator iter3 = list.iterator();
        System.out.print("HEAD -> ");
        while(iter3.hasNext()) {
            System.out.print(iter3.next());
            System.out.print("<=>");
        }
        System.out.println("null");





    }
}
