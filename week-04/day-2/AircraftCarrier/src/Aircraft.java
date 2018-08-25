public class Aircraft {
  String type;
  int maxAmmo;
  int baseDamage;
  int currentAmmo = 0;
  boolean isPriority;

  public Aircraft(String type, int maxAmmo, int baseDamage, boolean isPriority) {
    this.type = type;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.isPriority = isPriority;
    this.currentAmmo = currentAmmo;
  }

  public int fight() {
    currentAmmo = 0;
    return baseDamage * maxAmmo;
  }

  public int refill(int ammoAdded) {
    int neededAmmo = maxAmmo - currentAmmo;

    if (neededAmmo == 0) {
      return ammoAdded;
    } else if (neededAmmo <= ammoAdded) {
      return ammoAdded - neededAmmo;
    } else {
      currentAmmo = maxAmmo;
      return ammoAdded - maxAmmo;
    }
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    return "Type " + type + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage + ", All Damage: " + baseDamage * maxAmmo;
  }
}
