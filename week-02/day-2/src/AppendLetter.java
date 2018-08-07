import java.util.*;

public class AppendLetter{
  public static void main(String... args){
    List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");

    System.out.println(appendA(far));
  }

  public static List appendA (List a) {

    for (int i = 0; i < a.size(); i++) {
      a.set(i, a.get(i) + "a");
    }
    return a;
  }

}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"