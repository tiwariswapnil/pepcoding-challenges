package io.github.pepcoding.linkedlists;

import java.util.LinkedList;

public class LinkedListToQueueAdapter {

    public static class LLToQueueAdapter {
        LinkedList<Integer> list;

        public LLToQueueAdapter() {
            list = new LinkedList<>();
        }

        int size() {
            return list.size();
        }

        void add(int val) {
            list.add(val);
        }

        int remove() {
            if (size() == 0) {
                System.out.println("Queue underflow");
                return -1;
            }
            return list.removeFirst();
        }

        int peek() {
            if (size() == 0) {
                System.out.println("Queue underflow");
                return -1;
            }
            return list.peekFirst();
        }
    }

}
