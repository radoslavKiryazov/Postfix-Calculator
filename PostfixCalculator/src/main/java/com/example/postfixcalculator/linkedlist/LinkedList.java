package com.example.postfixcalculator.linkedlist;

public class LinkedList<T> {
    private Node<T> head;
    private int size = 0;


    public void printer() {
        Node<T> temp = head;

        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public void insertAtTheStart(T data){
        Node<T> node = new Node<>(data);

        node.next = head;
        head = node;
        size++;
    }

    public void deleteAtTheStart(){
        head = head.next;
        size--;

    }
    public T getHead(){
        return head.data;
    }

    public boolean isEmpty(){
        return head == null;
    }


    public int size() {
        return size;
    }
}
