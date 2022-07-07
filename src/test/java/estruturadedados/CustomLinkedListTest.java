package estruturadedados;

import estruturadedados.list.CustomDoublyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomLinkedListTest {

    CustomDoublyLinkedList<Integer> list;

    @BeforeEach
    public void init() {
        list = new CustomDoublyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(null);
    }

    @Test
    public void addTest() {
        assertEquals(4, list.getSize());
        assertEquals(10, list.getFirst().getItem());
        assertNull(list.getLast().getItem());
    }

    @Test
    public void getTest() {
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
        assertEquals(30, list.get(2));
        assertNull(list.get(3));
    }

    @Test
    public void deleteTest() {
        assertFalse(list.remove(1)); //  não existe na lista
        assertTrue(list.remove(10)); // remove a posição 1
        assertEquals(3, list.getSize());
    }

    @Test
    public void putTest(){
        assertEquals(10, list.put(0, list.get(0) * 10));
        assertEquals(100, list.get(0));
        assertEquals(20, list.put(1, list.get(1) * 10));
        assertEquals(200, list.get(1));
    }

}
