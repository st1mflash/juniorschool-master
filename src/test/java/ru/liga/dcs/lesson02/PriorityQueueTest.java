package ru.liga.dcs.lesson02;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;


public class PriorityQueueTest {

    private PriorityQueue03<Integer> queue;

    @Before
    public void setUp() {
        queue = new PriorityQueue03<>();
    }

    @Test
    public void testInsertAndExtractMax() {
        queue.insert(3, 1);
        queue.insert(4, 2);
        queue.insert(5, 1);

        assertEquals(Integer.valueOf(3), queue.extractMax());
        assertEquals(Integer.valueOf(5), queue.extractMax());
        assertEquals(Integer.valueOf(4), queue.extractMax());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.insert(1, 1);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testExtractMaxFromEmptyQueue() {
        assertNull(queue.extractMax());
    }

    // Дополнительные тесты могут быть добавлены здесь
}
