package collection.array;

import java.util.Arrays;

public class ArrList<T> {

  private int size = 0;
  private int length = 0;
  @SuppressWarnings("unchecked")
  private T[] items = (T[]) new Object[0];

  public ArrList() {

  }

  public ArrList(T[] items) {
    this.items = items;
    this.size = items.length;
  }

  public void add(T item) {

    if (size == items.length) {
      size = (int) Math.floor(size * 1.5 + 1);
      items = Arrays.copyOf(items, size);
    }
    items[length] = item;
    length++;
  }

  public void pop() {
    if (size > 0) {
      items[length - 1] = null;
      length--;
    }
  }

  public void remove(int index) {
    if (index < 0 || index >= length) {
      return;
    }
    System.arraycopy(items, index + 1, items, index, length - index - 1);
    items[--length] = null;
  }

  public T get(int index) {
    return items[index];
  }

  public int size() {
    return length;
  }

  public void print() {
    for (int i = 0; i < length; i++) {
      System.out.println(items[i]);
    }
  }

}
