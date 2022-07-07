package algoritmos.interview.amazon;


/*
     Clone linkedList with random point
 */
class CloneLinkedListRandomPoint {

    static Node clone(Node start) {
        Node refStart = start;
        do {
            refStart.next = new Node(refStart.data, refStart.next, null);
            refStart = refStart.next.next;
        } while (refStart != null);

        refStart = start;
        do {
            refStart.next.random = refStart.random.next;
            refStart = refStart.next.next;
        } while (refStart != null);

        Node clone = new Node(start.next.data, start.next.next, start.next.random);
        Node refClone = clone;
        refStart = start;
        Node nextOriginal;

        do {
            nextOriginal = refStart.next.next;
            refClone.next = nextOriginal.next;
            refStart.next = nextOriginal;
            refClone = refClone.next;
            refStart = refStart.next;
        } while (refStart.next.next != null);
        refStart.next = null;

        return clone;
    }
}
