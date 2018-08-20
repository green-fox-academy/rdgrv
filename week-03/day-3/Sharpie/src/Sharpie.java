public class Sharpie {
  String color;
  double width;
  double inkAmount;

  public Sharpie(String color, double width) {
    inkAmount = 100;
  }

  public void use() {
    inkAmount -= 5.5;
    if (inkAmount < 0) {
      inkAmount = 0;
    }
  }
}