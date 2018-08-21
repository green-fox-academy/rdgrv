import java.util.ArrayList;

public class Cohort {
  String name;
  ArrayList<Student> students = new ArrayList<>();
  ArrayList<Mentor> mentors = new ArrayList<>();

  public ArrayList<Student> addStudent(Student student) {
    this.students.add(student);
    return students;
  }

  public ArrayList<Mentor> addMentor(Mentor mentor) {
    this.mentors.add(mentor);
    return mentors;
  }

  public void info() {
    System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
  }

  public Cohort(String name){
    this.name = name;
    this.students = students;
    this.mentors = mentors;
  }
}