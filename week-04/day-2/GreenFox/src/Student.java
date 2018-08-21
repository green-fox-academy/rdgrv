public class Student extends Person{
  String previousOrganization;
  int skippedDays;

  public void getGoal() {
    String goal = "Be a junior software developer";
    System.out.println("My goal is: " + goal +".");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + "who skipped " + skippedDays + " days from the course already.");
  }

  public int skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
    return skippedDays;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    skippedDays = 0;
  }

  public Student () {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }
}