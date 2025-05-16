package collection.set;

import java.util.Arrays;

public class SetMain {

  public static void main(String[] args) {
//    HashSet<String> set = new HashSet<>();
//    set.add("A");
//    set.add("A");
//    set.add("B");
//    set.print();

//    HashIndexSet set = new HashIndexSet();
//
//    System.out.println(set.hashIndex(1));
//    System.out.println(set.hashIndex(9));
//    System.out.println(set.hashIndex(99));

    HashSet2 set = new HashSet2();
    set.add(1);
    set.add(2);
    set.add(5);
    set.add(9);
    set.add(99);

    System.out.println(Arrays.toString(set.getBuckets()));
    System.out.println(set.contains(9));
    System.out.println(set.contains(3));
  }
}