//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    Node head = new Node("a");
    head.next = new Node("b");
    head.next.next = new Node("c");

    System.out.println(head.toString());

    Node last = head.getLastNode();
    System.out.println("last: " + last.toString());
  }
}