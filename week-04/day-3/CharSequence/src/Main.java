public class Main {
  public static void main(String[] args) {

    Gnirts gnirts = new Gnirts("gnirts");
    Shifter shifter = new Shifter("shifter", 2);

    System.out.println(gnirts.length());
    System.out.println(gnirts.charAt(2));
    System.out.println(gnirts.subSequence(2, 4));
    System.out.println(shifter.length());
    System.out.println(shifter.charAt(0));
    System.out.println(shifter.subSequence(2, 4));
  }
}
