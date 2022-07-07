package estruturadedados.list;

import estruturadedados.common.Node;
import lombok.Getter;

@Getter
public class CustomDoublyLinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public void add(E e) {
        Node<E> currentLast = this.last;
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
            for (var x = first; x != null; x = x.getNext()){
                if (x.getItem() == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (var x = first; x != null; x = x.getNext()){
                if (o.equals(x.getItem())) {
                    unlink(x);
                    return true;
                }
            }
        }
        this.size--;
        return false;
    }

    public E put(int index, E element) {
        var node = getNode(index);
        var oldValue = node.getItem();
        node.setItem(element);
        return oldValue;
    }

    private void unlink(Node<E> x) {
        E element = x.getItem();
        var next = x.getNext();
        var prev = x.getPrev();

        if (prev == null) {
            first = next;
        } else {
            prev.setNext(next);
            x.setPrev(null);
        }

        if (next == null) {
            last = prev;
        } else {
            next.setPrev(prev);
            x.setNext(null);
        }
    }

    private Node<E> getNode(int index) {
        isValidIndex(index);
        Node<E> ref;
        if (index <= (size/2)){
            ref = first;
            for (var i=0; i<index; i++) {
                ref = ref.getNext();
            }
        } else {
            ref = last;
            for (int i = size-1; i > index; i--) {
                ref = ref.getPrev();
            }
        }
        return ref;
    }

    private void isValidIndex(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(String.format("Index %s invalid", index));
        }
    }

}
