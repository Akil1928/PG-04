package model.Stack;

import model.Queue.ArrayQueue;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

    @Test
    void arrayQueueTest() throws StackException {
        ArrayQueue<Integer> stack = new ArrayQueue<>(20);
        for (int i = 0; i < 5; i++) {
            int value = new Random().nextInt(50);
            try {
                System.out.println("enQueue(" + value + ")");
                queue.enQueue(value);
            } catch (StackException e) {
            }
        }
        System.out.println("Stack size: "+queue.size());
        System.out.println("Peek - Front"+queue.peek());
        System.out.println(stack);

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("pop() -> " + queue.deQueue());
            } catch (StackException e) {
            }
        }
    }
}