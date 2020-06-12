public class Student {
  String firstName;
  String lastName;
  int year;
  double GPA;
  boolean declaredMayor;

  public Student(String firstName, String lastName, int year, double GPA, boolean declaredMayor) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.year = year;
    this.GPA = GPA;
    this.declaredMayor = declaredMayor;
  }

  public void incrementYear() {
    this.year++;
    System.out.println("Expected graduation year of " + this.firstName + " is " + this.year);
  }

  public void printProfile() {
    System.out.println("Name:" + this.firstName +
                        " LastName: " + this.lastName + 
                        " Year: " + this.year +
                        " GPA: " + this.GPA +
                        " Mayor: " + this.declaredMayor);
  }
}