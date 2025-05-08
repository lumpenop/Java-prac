package collection.list;

public interface MyList<T> {

  int size();

  void add(T item);

  void add(int index, T item);

  T get(int index);

  T set(int index, T item);

  void remove(int index);

  int indexOf(T item);

}
