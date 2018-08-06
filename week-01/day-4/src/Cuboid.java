public class Cuboid {
  public static void main(String[] args) {
    double a = 6;
    double b = 7;
    double c = 8;

    double surfaceArea = 2 * (a * b + b * c + a * c);
    double volume = a * b * c;

    if (surfaceArea % 1 != 0) {
      System.out.println("Surface Area: " + surfaceArea);
    } else {
      System.out.println("Surface Area: " + Math.round(surfaceArea));
    }

    if (volume % 1 != 0) {
      System.out.println("Volume: " + volume);
    } else {
      System.out.println("Volume: " + Math.round(volume));
    }
  }
}





