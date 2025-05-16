package collection.set;

import java.util.LinkedList;

public class HashSet2 {

  final int CAPACITY = 10;
  final LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];

  public HashSet2() {
    for (int i = 0; i < CAPACITY; i++) {
      buckets[i] = new LinkedList<Integer>();
    }
  }

  public void add(int value) {
    int hash = hashIndex(value);
    buckets[hash].add(value);
    LinkedList<Integer> bucket = buckets[hash];
    if (!bucket.contains(value)) {
      bucket.add(value);
    }
  }

  public LinkedList<Integer>[] getBuckets() {
    return buckets;
  }

  public int hashIndex(int value) {
    return value % CAPACITY;
  }

  public boolean contains(LinkedList<Integer> bucket, Integer item) {
    boolean found = false;
    for (Integer element : bucket) {
      if (element.equals(item)) {
        found = true;
      }
    }
    return found;
  }

  public boolean contains(int value) {
    int hash = hashIndex(value);
    LinkedList<Integer> bucket = buckets[hash];
    return bucket.contains(value);
  }


}
