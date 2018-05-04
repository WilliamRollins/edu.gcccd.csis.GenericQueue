package edu.gcccd.csis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenericQueueTest {

    @Test
    public void dequeueTest() {
        double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        GenericQueue<Double> doubleStack = new GenericQueue<>(5);
        double[] intElements = {1, 2, 3, 4, 5};
        GenericQueue<Double> intStack = new GenericQueue<>(5);
//int stack
        for(double doubles : doubleElements) {
            doubleStack.enqueue(doubles);
        }
//double stack
        for(double ints : intElements) {
            intStack.enqueue(ints);
        }
//testing deque of doubles
        doubleStack.dequeue();
        assertEquals(2.2, doubleStack.peek(0), 0 );
        //check to see if handel null stack.
        int i =1;
        while( i != doubleStack.length()){
            doubleStack.dequeue();
        }
        assertEquals(5.5, doubleStack.peek(0), 0);
//testing empty stack
        doubleStack.dequeue();
        assertNull( doubleStack.peek(intStack.length()));
//testing deque of ints
        intStack.dequeue();
        assertEquals(2, intStack.peek(0), 0 );
        //check to see if handel null stack.
        while( i != intStack.length()){
            intStack.dequeue();
        }
        assertEquals(5, intStack.peek(0), 0);
//testing empty intstack
        intStack.dequeue();
        assertNull( intStack.peek(intStack.length()));
    }


    @Test
    public void enqueueTest() {
        double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        GenericQueue<Double> doubleStack = new GenericQueue<>(5);
        int[] intElements = {1, 2, 3, 4, 5};
        GenericQueue<Integer> intStack = new GenericQueue<>(5);
//double stack
        for(double doubles : doubleElements) {
            doubleStack.enqueue(doubles);
        }
//insure 5.5 was last element added
        assertEquals(5.5, doubleStack.peek(doubleStack.length()-1),0);
//int stack
        for(int ints: intElements) {
            intStack.enqueue(ints);
        }
//insure 5 was last element added
        assertEquals(5, intStack.peek(intStack.length()-1),0);
    }

    @Test
    public void lenthTest() {
        double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        GenericQueue<Double> doubleStack = new GenericQueue<>(5);
        for(double doubles : doubleElements){
            doubleStack.enqueue(doubles);
        }
        assertEquals(5, doubleStack.length());
    }
}







