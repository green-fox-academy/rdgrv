public class Mentor extends Person{
  String level;

  public void getGoal() {
    String goal = "Educate brilliant junior software developers";
    System.out.println("My goal is: " + goal +".");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
  }

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    super("Jane Doe", 30, "female");
    level = "intermediate";
  }
}