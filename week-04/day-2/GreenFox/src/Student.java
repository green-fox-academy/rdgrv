public class Student extends Person implements Cloneable {
  String previousOrganization;
  int skippedDays;

  public void getGoal() {
    String goal = "Be a junior software developer";
    System.out.println("My goal is: " + goal + ".");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public int skipDays(int numberOfDays) {
    return skippedDays += numberOfDays;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student() {
    super("Jane Doe", 30, "female");
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public Student clone() {
    Student name = new Student(this.name, this.age, this.gender, this.previousOrganization);
    return name;
  }
}