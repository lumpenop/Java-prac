package collection.array;

public class ArrayMain {

  public static void main(String[] args) {
    ArrList<String> list = new ArrList<>();
    list.add("a");
    list.add("b");
    list.add("c");

    String a = list.get(0);
    System.out.println(a);
    System.out.println("size: " + list.size());

    list.print();

    System.out.println("----");
    list.pop();
    System.out.println("size: " + list.size());

    list.print();

    System.out.println("----");
    list.add("c");
    list.add("d");
    list.add("e");
    list.remove(1);
    list.print();

  }
}
