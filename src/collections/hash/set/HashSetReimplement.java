package collections.hash.set;

import collections.Student;

import java.util.*;

public class HashSetReimplement<E> implements Set<E> {
  private HashMap<Integer, Student> localInstance;
  private int key = 0;

  public HashSetReimplement() {
    localInstance = new HashMap<>();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Set: \n");

    for (Map.Entry<Integer, Student> st: localInstance.entrySet()){
      sb.append("    ")
        .append("{ \n")
        .append("     firstName: " + st.getValue().getName() + ", \n")
        .append("     details: " + st.getValue().getDetails() + ", \n")
        .append("     dateOfBirth: " + st.getValue().getDateOfBirth())
        .append("\n    }, \n");
    }

    return sb.toString();
  }

  @Override
  public int size() {
    return 0;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean contains(Object o) {
    return false;
  }

  @Override
  public Iterator<E> iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    Student [] arr = new Student[localInstance.size()];
    int i = 0;
    for (Map.Entry<Integer, Student> st: localInstance.entrySet()){
      arr[i] = new Student(st.getValue().getName(), st.getValue().getDateOfBirth(), st.getValue().getDetails());
    }
    return arr;
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return null;
  }

  @Override
  public boolean add(E o) {
    Student student = (Student)o;
    int oldSize = localInstance.size();
    localInstance.put(student.hashCode(), student);
    key++;
    int newSize = localInstance.size();
    return newSize > oldSize;
  }

  @Override
  public boolean remove(Object o) {
    int oldSize = localInstance.size();
    Student st = (Student) o;
    localInstance.remove(st.hashCode());
    key--;
    int newSize = localInstance.size();
    return newSize < oldSize;
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends E> c) {
    int i = 0;
    Iterator it = c.iterator();
    while (it.hasNext()) {
      add((E) it.next());
      i++;
    }

    return i > 0;
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    return false;
  }

  @Override
  public void clear() {
    localInstance.clear();
  }
}
