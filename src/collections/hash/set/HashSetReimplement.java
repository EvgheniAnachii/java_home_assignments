package collections.hash.set;

import collections.Student;

import java.util.*;

public class HashSetReimplement<T> implements Set<T> {
  private Map<String, T> localInstance;

  public HashSetReimplement() {
    localInstance = new HashMap<>();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Set: {\n");

    for (Map.Entry<String, T> st: localInstance.entrySet()){
      Student currentSt = (Student)st;
      sb.append("    ")
        .append("{ ")
        .append("firstName: " + currentSt.getName())
        .append("details: " + currentSt.getDetails())
        .append("dateOfBirth: " + currentSt.getDateOfBirth());
    }

    sb.append("\n}");
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
  public Iterator<T> iterator() {
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
  public boolean add(T student) {
    return false;
  }

  @Override
  public boolean remove(Object o) {
    return false;
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends T> c) {
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
