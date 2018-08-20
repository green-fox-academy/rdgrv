public class Main {
  public static void main(String[] args) {
    Sharpie greenSharpie = new Sharpie("green", 6.8);
    Sharpie yellowSharpie = new Sharpie("yellow", 7);

    SharpieSet sharpieSet = new SharpieSet();
    sharpieSet.add(greenSharpie);
    sharpieSet.add(yellowSharpie);

    for (int i = 0; i < 20; i++) {
      greenSharpie.use();
    }
    System.out.println(greenSharpie.inkAmount);

    System.out.println(sharpieSet.countUsable());
    sharpieSet.removeTrash();
  }
}
