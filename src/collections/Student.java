package collections;
import java.lang.Object;
import java.time.LocalDate;
import java.util.UUID;

public class Student {
  private String name;
  private LocalDate dateOfBirth;
  private String details;
  private int id;

  public Student(String name, LocalDate dateOfBirth, String details) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.details = details;
    id = UUID.randomUUID().hashCode();
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
    boolean toReturn = student.name == name && student.dateOfBirth.equals(dateOfBirth);
    return toReturn;
  }

  @Override
  public int hashCode() {
    return id;
  }

  @Override
  public String toString() {
    return "{name: "+ name + "}, {dateOfBirth: "+ dateOfBirth + "}, {details: "+ details + "}";
  }
}
