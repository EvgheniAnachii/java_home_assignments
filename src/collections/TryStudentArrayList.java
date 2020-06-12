package collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TryStudentArrayList {
  public static void main(String [] args) {
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
}
