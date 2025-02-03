package com.keyin;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    //create a linked list
    public Node createLinkedList (int nodeValue) {
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //insert into linked list
        //0. if the link doesn't exist
        //1. insert at the beginning
        //2. insert at the end
        //3. insert in the middle

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if(head == null) {
            createLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while(index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = node;
            node.next = nextNode;
        }
        size++;
    }

    //traverse a linked list
    public void traverseLinkedList(){
        if (head == null) {
            System.out.println("Single Linked List does not exist.");
        } else {
            Node temNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(temNode.value);
                if(i != size -1) {
                    System.out.print(" -> ");
                }
                temNode = temNode.next;
            }
            System.out.print("\n");
        }
    }
    //search for a node

    public boolean searchNode (int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found the node: " + tempNode.value + " at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    //Deleting a Node from the linked list

    //0. if the link doesn't
    //1. delete at the begining
    //2. delete at the ending
    //3. delete anywhere

    public void deleteFromLinkedList(int location){
        if(head == null) {
            System.out.println("The Linked List does not exist.");
        } else if (location == 0) {
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if ( location >= size - 1) {
            Node tempNode = head;
            for (int i = 0; i < size - 2; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head = tail = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < size -1; i++) {
                tempNode = tempNode.next;
            }tempNode.next = tempNode.next.next;
            size--;
        }
    }
}
