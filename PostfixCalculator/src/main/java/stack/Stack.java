package stack;

import linkedlist.LinkedList;

public class Stack<T> {
    private final LinkedList<T> list;

    public Stack() {
        list = new LinkedList<>();
    }

    public void push(T data) {
        list.insertAtTheStart(data);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T data = list.getHead();
        list.deleteAtTheStart();
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getHead();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void printStack() {
        list.printer();
    }

    public int size() {
        return list.size();
    }
}