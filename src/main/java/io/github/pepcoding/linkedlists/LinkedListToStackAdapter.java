package io.github.pepcoding.linkedlists;

import java.util.LinkedList;

public class LinkedListToStackAdapter {

    public static class LLToStackAdapter {
        LinkedList<Integer> list;

        public LLToStackAdapter() {
            list = new LinkedList<>();
        }

        int size() {
            return list.size();
        }

        void push(int val) {
            list.add(val);
        }

        int pop() {
            if (size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            return list.removeLast();
        }

        int top() {
            if (size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            return list.getLast();
        }
    }

}
