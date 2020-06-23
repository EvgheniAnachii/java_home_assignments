package collections;

import collections.hash.map.HashMapReimplement;
import collections.hash.set.HashSetReimplement;

import java.time.LocalDate;
import java.util.*;

public class TryStudentArrayList {
  private static void checkArrayListImplementation() {
    LocalDate date = LocalDate.now();
    Student st0 = new Student("Paul", date, "These are some details about this student");
    Student st1 = new Student("Kerry", date, "More details...");
    Student st2 = new Student("John", date, "These are some details about John student");
    System.out.println(st0);
    List<Student> arrSt = new StudentArrayList<>();
    List <String> a = new ArrayList<String>();
    arrSt.add(0, st0);
    arrSt.add(1, st1);
    System.out.println("-------------");
    System.out.println(arrSt);
    System.out.println("-------------");
    arrSt.set(0, st2);
    arrSt.set(2, st2); // will not be added/set since it exceeds the array length
    System.out.println(arrSt);
    arrSt.remove(st1);
    System.out.println("AFTER REMOVING: ");
    System.out.println(arrSt);
  }

  private static void tryHashMap() {
    Student st = new Student("Jally", LocalDate.now(), "some details");
    Student st2 = new Student("Peter", LocalDate.now(), "some ");
    HashMapReimplement<String, Student> hashMapSt = new HashMapReimplement<>();
    hashMapSt.put("myFirstSt", st);
    hashMapSt.put("myFirstSnd", st2);
    hashMapSt.put("myThird", st2);
    hashMapSt.put("myFourth", st2);
    System.out.println(hashMapSt);
    System.out.println("FOUND: "+hashMapSt.get("myFirstSt"));
    System.out.println("FOUND: "+hashMapSt.get(st2));
  }

  private static void checkHashSetImplementation() {
    Set<Student> st = new HashSetReimplement<>();
    Set<Student> stStandard = new HashSet<>();
    LocalDate date = LocalDate.now();
    Student st1 = new Student("Julie", date, "some details");
    Student st2 = new Student("Kerry", date, "More details...");
    Student st3 = new Student("John", date, "These are some details about John student");

    Student newSt1 = new Student("Peter", date, "about Peter student");
    Student newSt2 = new Student("Ormando", date, "just Ormando");
    Student [] arr = new Student[2];

    arr[0] = newSt1;
    arr[1] = newSt2;

    stStandard.add(st1);
    stStandard.add(st2);
    stStandard.remove(st1);
    System.out.println("standard" + stStandard);

    st.add(st1);
    st.add(st2);
    st.remove(st1);
    System.out.println("custom" + st);
    Object[] sts = st.toArray();
    System.out.println(sts);

    st.addAll(Arrays.asList(arr));
    System.out.println(st);
  }

  public static void main(String [] args) {
    // checkArrayListImplementation();
    //checkHashSetImplementation();
    tryHashMap();
  }
}
