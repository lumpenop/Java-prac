public class Node<T> {

  T item;
  Node<T> next;

  public Node(T item) {
    this.item = item;
  }

  public Node<T> getLastNode() {
    Node<T> node = this;
    while (node.next != null) {
      node = node.next;
    }
    return node;
  }

  public int size() {
    int size = 0;
    Node<T> node = this;
    while (node != null) {
      size++;
      node = node.next;
    }
    return size;
  }

  public T getNode(int index) {
    Node<T> node = this;
    int i = 0;
    while (node != null) {
      if (i == index) {
        return node.item;
      }
      node = node.next;
      i++;
    }
    return item;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    Node<T> current = this;
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
