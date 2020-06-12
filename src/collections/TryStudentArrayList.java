package collections;

import collections.hash.set.HashSetReimplement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

  private static void checkHashSetImplementation() {
    Set<Student> st = new HashSetReimplement();
    Set<Student> stStandard = new HashSet<>();
    LocalDate date = LocalDate.now();
    Student st1 = new Student("Julie", date, "some details");
    Student st2 = new Student("Kerry", date, "More details...");
    Student st3 = new Student("John", date, "These are some details about John student");
    stStandard.add(st1);
    stStandard.add(st2);
    stStandard.remove(st1);
    /*System.out.println("st1: " + st1.hashCode());
    System.out.println("st2: " + st2.hashCode());
    System.out.println("st3: " + st3.hashCode());*/
    st.add(st1);
    st.add(st2);
    st.add(st3);
    st.remove(st1);
    System.out.println(st);
  }

  public static void main(String [] args) {
    // checkArrayListImplementation();
    checkHashSetImplementation();
  }
}
