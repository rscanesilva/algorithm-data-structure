package estruturadedados.list;

import estruturadedados.common.Node;
import lombok.Getter;

@Getter
public class CustomDoublyLinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public void add(E e) {
        Node<E> currentLast = last;
        Node<E> newNode = new Node<>(e, currentLast, null);
        if (currentLast == null) first = newNode;
        else currentLast.setNext(newNode);
        last = newNode;
        this.size++;
    }

    public E get(int index) {
        return getNode(index).getItem();
    }

    public boolean remove(Object o) {
        if (o == null) {
            for (Node<E> x = first; x != null; x = x.getNext()) {
                if (x.getItem() == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = first; x != null; x = x.getNext()) {
                if (o.equals(x.getItem())) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    public E put(int index, E element) {
        Node<E> x = getNode(index);
        E oldVal = x.getItem();
        x.setItem(element);
        return oldVal;
    }

    private Node<E> getNode(int index) {
        isValidIndex(index);
        if (index <= (size>>1)) {
            var x = first;
            for (var i=0; i<index; i++) {
                x = x.getNext();
            }
            return x;
        } else {
            var x = last;
            for (var i= size-1; i > index; i--) {
                x = x.getPrev();
            }
            return x;
        }
    }

    private void isValidIndex(int index) {
        if (index < 0 || index >= size) throw new ArrayIndexOutOfBoundsException(String.format("index %s not found", index));
    }

    private void unlink(Node<E> x) {
        E element = x.getItem();
        Node<E> next = x.getNext();
        Node<E> prev = x.getPrev();

        if (prev == null) {
            first = next;
        } else {
            prev.setNext(next);
            x.setPrev(null);
        }

        if (next == null) {
            last = prev;
        } else {
            next.setNext(prev);
            x.setNext(null);
        }

        x.setItem(null);
        size--;
    }
}
