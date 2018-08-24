public class Plant {
  String color;
  String type;
  int waterLevel;
  int neededWater;
  double absorbCapacity;

  public Plant(String color, String type, int neededWater, double absorbCapacity) {
    this.color = color;
    this.type = type;
    this.neededWater = neededWater;
    this.absorbCapacity = absorbCapacity;
  }

  public void water(int water) {
    if (waterLevel < neededWater) {
      waterLevel += water * absorbCapacity;
    }
  }

  @Override
  public String toString() {
    return "The " + color + " " + type + (waterLevel < neededWater ? " needs water" : " doesn't need water");
  }
}
