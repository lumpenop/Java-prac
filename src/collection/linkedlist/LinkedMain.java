package collection.linkedlist;

public class LinkedMain {

  public static void main(String[] args) {
    LinkedList<String> linkedList = new LinkedList<>("a");

    linkedList.head.next = new Node<>("b");
    linkedList.add("c");

    System.out.println(linkedList.toString());

    Node<String> last = linkedList.getLastNode();
    System.out.println("last: " + last.item);
    System.out.println("size: " + linkedList.size());
    System.out.println("index 2 item: " + linkedList.getNode(2));
  }

}
