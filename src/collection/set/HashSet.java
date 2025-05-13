package collection.set;


@SuppressWarnings("unchecked")
public class HashSet<T> {

  private T[] items;
  private int size;

  public HashSet() {
    items = (T[]) new Object[10];
  }

  public HashSet(T[] items) {
    this.items = items;
  }

  public void add(T item) {
    if (contains(item)) {
      return;
    }
    if (size == items.length) {
      T[] newItems = (T[]) new Object[items.length * 2];
      System.arraycopy(items, 0, newItems, 0, items.length);
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

}
