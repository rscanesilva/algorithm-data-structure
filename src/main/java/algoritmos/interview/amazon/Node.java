package algoritmos.interview.amazon;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = random = null;
    }
}