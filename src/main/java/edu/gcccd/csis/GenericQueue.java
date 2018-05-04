package edu.gcccd.csis;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Stack;

public class GenericQueue<E> {
    private final ArrayList<E> elements; // ArrayList stores stack elements

    public GenericQueue() {
        this(10);
    }

    public GenericQueue(int capacity) {
        int initCapacity = capacity > 0 ? capacity : 10;
        elements = new ArrayList<E>(initCapacity);
    }

    public E dequeue() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.remove(0);
    }

    public void enqueue(E enqueueValue) {
        elements.add(enqueueValue);
    }

    public int length() {
        return elements.size();
    }

    public E peek(int n) {
        if (elements.isEmpty())
            return null;
        else
            return elements.get(n);
    }

}