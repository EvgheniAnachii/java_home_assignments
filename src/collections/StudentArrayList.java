package collections;

import java.util.*;

public class StudentArrayList<Student> implements List<Student> {
  private Student[] data = (Student[]) new Object[10];
  private int count = 0;

  /*--------------------------------------------*/
  @Override
  public boolean add(Student student) {
    // ensure capacity
    return false;
  }

  @Override
  public void clear() {
    // use Arrays.fill
    Arrays.fill(data, 0, 10, null);
    count = 0;
  }

  @Override
  public Student get(int index) {
    if(index <= 10) {
      return data[index];
    }
    return null;
  }

  @Override
  public Student set(int index, Student element) {
    if(index < count) {
      data[index] = element;
      return element;
    }
    return null;
  }

  @Override
  public void add(int index, Student element) {
    if (index <= count) {
      data[index] = element;
      count++;
    }
    data = Arrays.copyOf(data, count + 1);
  }

  private void firstImplementation(Object o) {
    int removalPosition = 0;
    for (int i = 0; i < data.length-1; i++) {
      Student currentSt = data[i];
      if (o.equals(currentSt)) {
        removalPosition = i;
      }
    }
    Student [] st1 = Arrays.copyOfRange(data, 0, removalPosition-1);
    Student [] st2 = Arrays.copyOfRange(data, removalPosition + 1, data.length);
    Arrays.fill(data, 0, st1.length, st1);
    Arrays.fill(data, st1.length+1, st2.length, st2);
    count = st1.length + st2.length;
  }

  private void secondImplementation(Object o) {
    for (int i = 0; i < data.length-1; i++) {
      Student currentSt = data[i];
      if (!o.equals(currentSt)) {
        Arrays.fill(data, i, i+1, data[i]);
        count = i+1;
      }
    }
  }

  @Override
  public boolean remove(Object o) {
    // firstImplementation(o);
    secondImplementation(o);
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("StudentArrayList [\n");
    for (int i = 0; i < count; i++){
      sb.append("    ").append(data[i]).append(", ");
      if((i + 2) == count) {
        sb.append("\n");
      }
    }

    if (count > 0) {
      sb.setLength(sb.length() - 2);
    }

    sb.append(",\n]");
    return sb.toString();
  }
  /*--------------------------------------------*/

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
  public boolean containsAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends Student> c) {
    return false;
  }

  @Override
  public boolean addAll(int index, Collection<? extends Student> c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    return false;
  }

  @Override
  public Student remove(int index) {
    return null;
  }

  @Override
  public int indexOf(Object o) {
    return 0;
  }

  @Override
  public int lastIndexOf(Object o) {
    return 0;
  }

  @Override
  public ListIterator<Student> listIterator() {
    return null;
  }

  @Override
  public ListIterator<Student> listIterator(int index) {
    return null;
  }

  @Override
  public List<Student> subList(int fromIndex, int toIndex) {
    return null;
  }
}
