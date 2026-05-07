package model.Stack;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class LinkedStackTest {
    @Test
    void linkedStackTest() throws StackException {
        LinkedStack<Integer> stack = new LinkedStack<>();
        for (int i = 0; i < 5; i++) {
            int value = new Random().nextInt(50);
            try {
                System.out.println("push(" + value + ")");
                stack.push(value);
            } catch (StackException e) {
            }
        }
        System.out.println("Stack size: "+stack.size());
        System.out.println("Peek - Top"+stack.peek());
        System.out.println(stack);

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("pop() -> " + stack.pop());
            } catch (StackException e) {
            }
        }
    }
}