import java.util.ArrayList;

public class SharpieSet {
  ArrayList<Sharpie> sharpies = new ArrayList<Sharpie>();
  int usableSharpies = 0;

  public void add(Sharpie sharpie) {
    sharpies.add(sharpie);
  }

  public int countUsable() {
    for (Sharpie sharpie : sharpies) {
      if (sharpie.inkAmount > 0) {
        usableSharpies++;
      }
    }
    return usableSharpies;
  }

  public void removeTrash() {
    for (int i = 0; i < sharpies.size(); i++) {
      if (sharpies.get(i).inkAmount == 0) {
        sharpies.remove(i);
      }
    }
  }
}