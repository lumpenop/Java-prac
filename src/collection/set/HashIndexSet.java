package collection.set;

public class HashIndexSet {

  private int CAPACITY = 10;
  private int[] items;

  public int hashIndex(int value) {
    return value % CAPACITY;
  }


}
