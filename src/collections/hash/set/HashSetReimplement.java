package collections.hash.set;

import collections.Student;

import java.util.*;

public class HashSetReimplement implements Set<Student> {
  private Map<Integer, Student> localInstance;
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
  public Iterator<Student> iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return null;
  }

  @Override
  public boolean add(Student student) {
    int oldSize = localInstance.size();
    localInstance.put(key, student);
    key++;
    int newSize = localInstance.size();
    return newSize > oldSize;
  }

  @Override
  public boolean remove(Object o) {
    int oldSize = localInstance.size();
    Student st = (Student) o;
    localInstance.remove(st);
    key--;
    int newSize = localInstance.size();
    return newSize < oldSize;
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends Student> c) {
    return false;
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

  }
}
