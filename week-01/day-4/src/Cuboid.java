public class Cuboid {
  public static void main(String[] args) {
    double a = 6;
    double b = 7;
    double c = 8;

    double surfaceArea = 2 * (a * b + b * c + a * c);
    double volume = a * b * c;

    System.out.println("Surface Area: " + surfaceArea);
    System.out.println("Volume: " + volume);
  }
  // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000
}
