public class Main {
  public static void main(String[] args) {
    Animal duck = new Animal();
    System.out.println(duck.hunger);
    System.out.println(duck.thirst);
    duck.eat();
    duck.drink();
    System.out.println(duck.hunger);
    System.out.println(duck.thirst);
    duck.play();
    System.out.println(duck.hunger);
    System.out.println(duck.thirst);

    Farm farm = new Farm();
    farm.breed(duck);
    farm.breed(duck);
    farm.breed(duck);
    farm.breed(duck);
    farm.breed(duck);
    farm.breed(duck);
    farm.breed(duck);
    farm.slaughter();
  }
}
