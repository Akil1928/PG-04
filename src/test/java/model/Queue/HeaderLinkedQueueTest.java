package model.Queue;

import static org.junit.jupiter.api.Assertions.*;

class HeaderLinkedQueueTest {

    @org.junit.jupiter.api.Test
    void testQueueOperations() throws QueueException {
        HeaderLinkedQueue<Integer> queue = new HeaderLinkedQueue<>();

        // Test isEmpty and size on new queue
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());

        // Test enQueue
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);

        assertFalse(queue.isEmpty());
        assertEquals(3, queue.size());
        assertEquals(10, queue.front());

        // Test indexOf
        assertEquals(1, queue.indexOf(10));
        assertEquals(2, queue.indexOf(20));
        assertEquals(3, queue.indexOf(30));
        assertEquals(-1, queue.indexOf(99));

        // Test contains
        assertTrue(queue.contains(20));
        assertFalse(queue.contains(50));

        // Test deQueue
        assertEquals(10, queue.deQueue());
        assertEquals(2, queue.size());
        assertEquals(20, queue.peek());

        // Test clear
        queue.clear();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @org.junit.jupiter.api.Test
    void testExceptions() {
        HeaderLinkedQueue<String> queue = new HeaderLinkedQueue<>();
        assertThrows(QueueException.class, queue::deQueue);
        assertThrows(QueueException.class, queue::front);
        assertThrows(QueueException.class, () -> queue.indexOf("test"));
    }

    @org.junit.jupiter.api.Test
    void testToString() throws QueueException {
        HeaderLinkedQueue<Integer> queue = new HeaderLinkedQueue<>();
        queue.enQueue(1);
        queue.enQueue(2);
        String result = queue.toString();
        assertTrue(result.contains("[1]"));
        assertTrue(result.contains("[2]"));
        assertTrue(result.contains("FRONT"));
        assertTrue(result.contains("REAR"));
    }


}