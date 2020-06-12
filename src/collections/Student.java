package collections;

import java.time.LocalDate;

public class Student {
  private String name;
  private LocalDate dateOfBirth;
  private String details;

  public Student(String name, LocalDate dateOfBirth, String details) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.details = details;
  }

  public String getName () {
    return name;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public String getDetails() {
    return details;
  }

  @Override
  public boolean equals(Object st) {
    Student student = (Student) st;
    return student.name == name && student.dateOfBirth.equals(dateOfBirth);
  }

  @Override
  public int hashCode() {
    return name.length() + dateOfBirth.getDayOfMonth() + dateOfBirth.getMonthValue() + dateOfBirth.getYear() % 2;
  }

  @Override
  public String toString() {
    return "{name: "+ name + "}, {dateOfBirth: "+ dateOfBirth + "}, {details: "+ details + "}";
  }
}
