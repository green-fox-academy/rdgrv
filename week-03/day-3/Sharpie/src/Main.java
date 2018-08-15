public class Main {
  public static void main(String[] args) {
    Sharpie sharpie = new Sharpie("green", 6.8);
    sharpie.use();
    System.out.println(sharpie.inkAmount);
  }
}
