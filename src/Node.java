public class Node {

  Object item;
  Node next;

  public Node(Object item) {
    this.item = item;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    Node current = this;
    sb.append("[");
    while (current != null) {
      sb.append(current.item);

      if (current.next != null) {
        sb.append("=>");
      }
      current = current.next;
    }
    sb.append("]");
    return sb.toString();
  }
}
