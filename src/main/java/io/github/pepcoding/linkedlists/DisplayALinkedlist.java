package io.github.pepcoding.linkedlists;

public class DisplayALinkedlist {

    public static class Node {
        int data;
        AddLastInLinkedList.Node next;
    }

    public static class LinkedList {
        AddLastInLinkedList.Node head;
        AddLastInLinkedList.Node tail;
        int size;

        void addLast(int val) {
            AddLastInLinkedList.Node temp = new AddLastInLinkedList.Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size(){
            return size;
        }

        public void display(){
            AddLastInLinkedList.Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

}
