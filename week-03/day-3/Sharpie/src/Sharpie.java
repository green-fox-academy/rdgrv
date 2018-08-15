public class Sharpie {
  String color;
  double width;
  double inkAmount;

  public Sharpie(String color, double width) {
    this.inkAmount = 100;
  }

  public void use() {
    inkAmount -= 5.5;
  }
}