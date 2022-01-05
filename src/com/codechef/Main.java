package com.codechef;
import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {
	// linkedlist implementation with its internal working :
        /*
        it uses a doubly linked list internally to store and organize the data:
         */
        LinkedList <Integer> list = new LinkedList<>();
        list.add(67);
        list.add(87);
        list.addFirst(65);
        list.set(0,86);
        System.out.println(list);
        // to traverse the elements:
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
