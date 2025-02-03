package com.keyin;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.insertInLinkedList(1, 0);
        sll.insertInLinkedList(3, 1);
        sll.insertInLinkedList(5, 3);
        sll.insertInLinkedList(7, 4);

        System.out.println("Initial Linked List:");
        sll.traverseLinkedList();
        sll.searchNode(3);

        System.out.println("\nDeleting from the beginning:");
        sll.deleteFromLinkedList(0);
        sll.traverseLinkedList();

        System.out.println("\nDeleting from the end:");
        sll.deleteFromLinkedList(sll.size - 1);
        sll.traverseLinkedList();

        System.out.println("\nDeleting from a specific location (index 1):");
        sll.deleteFromLinkedList(1);
        sll.traverseLinkedList();
    }
}