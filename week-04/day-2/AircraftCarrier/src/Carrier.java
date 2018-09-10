import java.util.ArrayList;
import java.util.EmptyStackException;

public class Carrier {
  ArrayList<Aircraft> carrier = new ArrayList<>();
  int storedAmmo;
  int hp;

  public Carrier(int storedAmmo, int hp) {
    this.storedAmmo = storedAmmo;
    this.hp = hp;
  }

  public void add(Aircraft aircraft) {
    carrier.add(aircraft);
  }

  public int neededAmmo() {
    int neededAmmo = 0;
    for (Aircraft aircraft : carrier) {
      if (aircraft.currentAmmo != aircraft.maxAmmo) {
        neededAmmo += aircraft.maxAmmo - aircraft.currentAmmo;
      }
    }
    return neededAmmo;
  }

  public void fill() {
    if (neededAmmo() <= storedAmmo && storedAmmo != 0) {
      for (Aircraft aircraft : carrier) {
        if (aircraft.currentAmmo != aircraft.maxAmmo) {
          storedAmmo -= aircraft.maxAmmo - aircraft.currentAmmo;
          aircraft.currentAmmo = aircraft.maxAmmo;
        }
      } else if (neededAmmo() > storedAmmo && storedAmmo != 0) {
        for (Aircraft aircraft : carrier) {
          if (aircraft.isPriority) {

          }

          } else {
            throw new EmptyStackException();
          }
        }
      }
    }