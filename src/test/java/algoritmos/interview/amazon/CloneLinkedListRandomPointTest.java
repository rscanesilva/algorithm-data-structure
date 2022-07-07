package algoritmos.interview.amazon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CloneLinkedListRandomPointTest {
    Node start;

    @BeforeEach
    public void ini(){
        start = new Node(1);
        start.next = new Node(2);
        start.next.next = new Node(3);
        start.next.next.next = new Node(4);
        // 1's random points to 3
        start.random = start.next.next;
        // 2's random points to 4
        start.next.random = start.next.next.next;
        // 3's random points to 1
        start.next.next.random = start;
        // 4's random points to 2
        start.next.next.next.random = start.next;

    }

    @Test
    public void cloneTest() {
        System.out.println("Original list: ");
        String original = toString(start);

        Node cloned_list = CloneLinkedListRandomPoint.clone(start);
        System.out.println("Cloned list: ");
        String cloned = toString(cloned_list);

        Assertions.assertEquals(original, cloned);
    }

    static String toString(Node start) {
        Node ptr = start;
        StringBuilder result = new StringBuilder();
        while (ptr != null) {
            result.append(String.format("Data = %s, Random=%s%n", ptr.data, ptr.random != null ? ptr.random.data : "null"));
            ptr = ptr.next;
        }
        System.out.println(result);
        return result.toString();
    }
}
