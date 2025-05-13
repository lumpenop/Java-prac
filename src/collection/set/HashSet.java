package collection.set;


import java.util.Arrays;

@SuppressWarnings("unchecked")
public class HashSet<T> {

  private T[] items;
  private int capacity = 10;
  private int size = 0;

  public HashSet() {
    items = (T[]) new Object[capacity];
  }

  public HashSet(T[] items) {
    this.items = items;
  }

  public void add(T item) {
    if (contains(item)) {
      return;
    }
    if (capacity == items.length) {
      capacity = items.length * 2;
      T[] newItems = (T[]) new Object[capacity];
      System.arraycopy(items, 0, newItems, 0, size);
      items = newItems;
    }
    items[size++] = item;
  }

  public boolean contains(T item) {
    boolean found = false;
    for (int i = 0; i < size; i++) {
      if (items[i].equals(item)) {
        found = true;
      }
    }
    return found;
  }

  public void print() {
    for (int i = 0; i < size; i++) {
      System.out.print(items[i] + " ");
    }
  }

  @Override
  public String toString() {
    return "HashSet{" +
        "items=" + Arrays.toString(Arrays.copyOf(items, size)) +
        ", size=" + size +
        '}';
  }
}
