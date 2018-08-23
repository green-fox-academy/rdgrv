public class Plant {
  String color;
  String type;
  int waterLevel;
  int neededWater;
  double absorbeCapacity;

  public Plant(String color) {
    this.color = color;
  }

  public void water(int water) {
    if (waterLevel < neededWater) {
      waterLevel += water * absorbeCapacity;
    }
  }

  public String info() {
    return "The " + color + " " + type + (waterLevel < neededWater ? " needs water" :" doesn't need water");
  }
}
