package collection.linkedlist;

public class LinkedList<T> {

  Node<T> head;

  public LinkedList(T item) {
    head = new Node<>(item);
  }

  public Node<T> getLastNode() {
    Node<T> node = head;
    while (node.next != null) {
      node = node.next;
    }
    return node;
  }

  public int size() {
    int size = 0;
    Node<T> node = head;
    while (node != null) {
      size++;
      node = node.next;
    }
    return size;
  }

  public T getNode(int index) {
    Node<T> node = head;
    int i = 0;
    while (node != null) {
      if (i == index) {
        return node.item;
      }
      node = node.next;
      i++;
    }
    return null;
  }

  public void add(T item) {
    Node<T> lastNode = getLastNode();
    lastNode.next = new Node<>(item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    Node<T> current = head;
    sb.append("[");
    while (current != null) {
      sb.append(current.item);

      if (current.next != null) {
        sb.append(" => ");
      }
      current = current.next;
    }
    sb.append("]");
    return sb.toString();
  }
}
