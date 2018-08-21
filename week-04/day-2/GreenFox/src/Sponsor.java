public class Sponsor extends Person{
  String company;
  int hiredStudents;

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public int hire() {
    return hiredStudents++;
  }

  public void getGoal() {
    String goal = "Hire brilliant junior software developers";
    System.out.println("My goal is: " + goal +".");
  }

  public Sponsor(String name, int age, String gender, String company) {
    hiredStudents = 0;
  }

  public Sponsor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    company = "Google";
    hiredStudents = 0;
  }
}