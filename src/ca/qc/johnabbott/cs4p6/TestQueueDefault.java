package ca.qc.johnabbott.cs4p6;

import ca.qc.johnabbott.cs4p6.collections.QueueOverflowException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestQueueDefault {

    public static final String DEFAULT_VALUE = "abc";

    private QueueDefault<String> queue;
    
    @Before
    public void setup() {
        queue = new QueueDefault<>(10, DEFAULT_VALUE);
    }

    @Test
    public void testQueueSuperClassMethodsStillWork() {
        queue.enqueue("and");
        assertEquals("and", queue.dequeue());
    }

    @Test
    public void testQueueEnqueueDequeueWithDefault() {
        assertEquals(DEFAULT_VALUE, queue.dequeue());
        queue.enqueue("def");
        assertEquals("def", queue.dequeue());
        assertEquals(DEFAULT_VALUE, queue.dequeue());
    }

    @Test
    public void testQueueIsEmpty() {
        // check that the queue is never empty
        queue.enqueue("abc");
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testQueueUnderflow() {
        // check that underflow is no longer a thing...
        for(int i=0; i<1000; i++)
            queue.dequeue();
    }

    @Test(expected = QueueOverflowException.class)
    public void testQueueOverflowStillWorks() {
        for(int i=0; i <= 10; i++)
            queue.enqueue("def");
    }


}
