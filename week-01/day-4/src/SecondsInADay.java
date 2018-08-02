public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int currentTime = currentHours * 60 * 60 + currentMinutes * 60 + currentSeconds;
    int secondsinaDay = 24 * 60 * 60;

    System.out.println(secondsinaDay - currentTime);
  }
}
