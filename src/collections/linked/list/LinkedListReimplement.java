package collections.linked.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedListReimplement<E> implements List<E>  {
  private class Node {
    Node next;
    E data;

    Node(E data) {
      this.data = data;
      this.next = null;
    }
    Node(){}
  }

  Node localLinkedList;

  @Override
  public void add(int index, E element) {
    int currentSize = size();
    if (index <= currentSize) {
      Node temp = localLinkedList;
      int currentPosition = 0;
      Node currentToBePrev;
      while (temp.next != null) {
        if (currentPosition >= 0 && index == currentPosition) {
          Node newNode = new Node(element);
          newNode.next = temp.next;
          currentToBePrev = temp;
          currentToBePrev.next = newNode;
          temp = currentToBePrev;
        }
        else if (index == currentSize && currentPosition+1 == currentSize) {
          Node newNode = new Node(element);
          currentToBePrev = temp;
          currentToBePrev.next = newNode;
        }

        temp = temp.next;
        currentPosition++;
      }
    } else {
      System.out.println("The list doesn't have element at such position");
    }
  }

  @Override
  public boolean add(E e) {
    Node newNode = new Node(e);
    if (this.localLinkedList ==  null) {
      localLinkedList = new Node();
      localLinkedList.next = newNode;
    } else {
      Node nodes = localLinkedList;
      while (nodes.next != null){
        nodes = nodes.next;
      }
      nodes.next = newNode;
    }

    return true;
  }

  @Override
  public E set(int index, E element) {
    return null;
  }

  @Override
  public E remove(int index) {
    return null;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MyLinkedList [");
    Node n = localLinkedList;
    while (n.next != null) {
      n = n.next;
      sb.append(n.data);
      if (n.next != null) {
        sb.append(", ");
      }
    }
    sb.append("]");
    return sb.toString();
  }

  @Override
  public boolean remove(Object o) {
    return false;
  }

  @Override
  public int size() {
    Node temp = localLinkedList;
    int count = 0;
    while (temp.next != null) {
      temp = temp.next;
      count++;
    }
    return count;
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
  public boolean addAll(Collection<? extends E> c) {
    return false;
  }

  @Override
  public boolean addAll(int index, Collection<? extends E> c) {
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
  public void clear() {

  }

  @Override
  public E get(int index) {
    Node temp = localLinkedList;
    int position = 0;
    while (temp.next != null) {
      if (position == index) {
        return temp.next.data;
      }
      temp = temp.next;
      position++;
    }
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
  public ListIterator<E> listIterator() {
    return null;
  }

  @Override
  public ListIterator<E> listIterator(int index) {
    return null;
  }

  @Override
  public List<E> subList(int fromIndex, int toIndex) {
    return null;
  }
}
