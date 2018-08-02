public class CodingHours {
  public static void main(String[] args) {
    int dailyCoding = 6;
    int semesterWeeks = 17;
    int workdays = semesterWeeks * 5;
    int semesterCoding = dailyCoding * workdays;
    System.out.println(semesterCoding);
    float averageWorkhours = 52 * 17;
    System.out.println(semesterCoding / averageWorkhours * 100 + "%");

  }
}
