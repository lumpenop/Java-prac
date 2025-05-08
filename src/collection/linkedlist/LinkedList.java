package collection.linkedlist;


import collection.list.MyList;

public class LinkedList<T> implements MyList<T> {

  private Node<T> head = null;
  private int size = 0;

  public LinkedList() {

  }

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


  @Override
  public int size() {
    return size;
  }


  @Override
  public T set(int index, T element) {

    Node<T> x = getNode(index);
    T oldValue = x.item;
    x.item = element;

    return oldValue;
  }


  @Override
  public T get(int index) {
    Node<T> node = getNode(index);
    return node.item;
  }

  @Override
  public int indexOf(T item) {
    int index = 0;
    while (index < size()) {
      if (get(index).equals(item)) {
        return index;
      }
      index++;
    }
    return -1;
  }

  @Override
  public void remove(int index) {
    if (index < 0 || index >= size) {
      return;
    }
    Node<T> node = head;
    if (index == 0) {
      head = node.next;
      size--;
      return;
    }
    node = getNode(index);
    node.next = node.next.next;
    size--;
  }

  public Node<T> getNode(int index) {
    Node<T> node = head;
    int i = 0;
    while (node != null) {
      if (i == index) {
        return node;
      }
      node = node.next;
      i++;
    }
    return null;
  }

  @Override
  public void add(T item) {
    if (head == null) {
      head = new Node<>(item);
      size++;
      return;
    }
    Node<T> lastNode = getLastNode();
    lastNode.next = new Node<>(item);
    size++;
  }

  @Override
  public void add(int index, T item) {
    if (index < 0 || index > size) {
      return;
    }
    if (index == 0) {
      Node<T> newNode = new Node<>(item);
      newNode.next = head;
      head = newNode;
      size++;
      return;
    }
    Node<T> node = getNode(index);
    Node<T> newNode = new Node<>(item);
    newNode.next = node.next;
    node.next = newNode;
    size++;
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
