import java.text.DecimalFormat;

public class Cuboid {
  public static void main(String[] args) {
    double a = 6;
    double b = 7;
    double c = 8;

    double surfaceArea = 2 * (a * b + b * c + a * c);
    double volume = a * b * c;
/*
I know this won't solve our problem since it won't work with decimal numbers,
but it was exciting to find out how to turn a double into an integer
*/
    int surfaceAreaInt = (int) surfaceArea;
    int volumeInt = (int) volume;

    System.out.println("Surface Area: " + surfaceAreaInt);
    System.out.println("Volume: " + volumeInt);
  }
}
