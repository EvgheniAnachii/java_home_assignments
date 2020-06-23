package collections.hash.map;

import collections.linked.list.LinkedListReimplement;

import java.util.*;

public class HashMapReimplement<K,V> implements Map<K,V> {
  private class KeyValuePair {
    K key;
    V value;

    KeyValuePair(K key, V value) {
      this.key = key;
      this.value = value;
    }

    @Override
    public String toString() {
      return "{ key: " + key + " }, value: {" + value + " }";
    }
  }

  public HashMapReimplement() {

  }

  LinkedListReimplement [] innerArr = new LinkedListReimplement[5];

  @Override
  public int size() {
    return 0;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean containsKey(Object key) {
    return false;
  }

  @Override
  public boolean containsValue(Object value) {
    return false;
  }

  @Override
  public V get(Object obj) {
    for (LinkedListReimplement<KeyValuePair> el: innerArr) {
      if (el != null) {
        int innerIt = 0;
        int linkedListSize = el.size();

        while (innerIt < linkedListSize) {
          KeyValuePair pn =  el.get(innerIt);
          if (pn.value.hashCode() == obj.hashCode() || pn.key.hashCode() == obj.hashCode()) {
            return pn.value;
          }
          innerIt++;
        }
      }
    }
    return null;
  }

  static final int hash(Object key) {
    int h;
    return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
  }

  @Override
  public V put(K key, V value) {
    KeyValuePair newElement = new KeyValuePair(key, value);
    LinkedListReimplement<KeyValuePair> tempList = innerArr[0];

    if (tempList == null) {
      tempList = new LinkedListReimplement<>();
    }

    tempList.add(newElement);
    int cellPosition = hash(newElement) % innerArr.length;
    innerArr[cellPosition] = tempList;

    return value;
  }

  @Override
  public V remove(Object key) {
    return null;
  }

  @Override
  public void putAll(Map<? extends K, ? extends V> m) {

  }

  @Override
  public void clear() {

  }

  @Override
  public Set<K> keySet() {
    return null;
  }

  @Override
  public Collection<V> values() {
    return null;
  }

  @Override
  public Set<Entry<K, V>> entrySet() {
    return null;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("HashMapReimplement: ");
    for (LinkedListReimplement<KeyValuePair> el: innerArr) {
      if (el != null) {
        int innerIt = 0;
        int linkedListSize = el.size();
        sb.append("\n");
        while (innerIt < linkedListSize) {
          KeyValuePair pn =  el.get(innerIt);

          sb.append("   {");
          sb.append(pn.key);
          sb.append(": {value: ");
          sb.append(pn.value.toString());
          sb.append("}");
          sb.append(",");
          sb.append("\n");

          innerIt++;
        }
      }
    }
    return sb.toString();
  }
}
