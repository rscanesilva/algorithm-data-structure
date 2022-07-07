package estruturadedados.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Node<E>  {
    private E item;
    private Node<E> prev;
    private Node<E> next;
}
