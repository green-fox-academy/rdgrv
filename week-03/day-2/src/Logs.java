import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Logs {
  public static void main(String[] args) {
    Path path = Paths.get("assets/logs.txt");
    ArrayList<String> lines = new ArrayList<>();
    try {
      lines.addAll(Files.readAllLines(path));
    } catch (Exception e) {
    }
    System.out.println(ipAddress(lines));
    System.out.println(getPostRatio(lines));
  }

  public static ArrayList<String> ipAddress(ArrayList<String> lines) {
    ArrayList<String> uniqueList = new ArrayList<>();

    for (int i = 0; i < lines.size(); i++) {
      String ip = lines.get(i).split("   ")[1];

      if (!uniqueList.contains(ip)) {
        uniqueList.add(ip);
      }
    }
    return uniqueList;
  }

  public static double getPostRatio(ArrayList<String> lines) {
    ArrayList<String> getPostRatio = new ArrayList<>();
    double get = 0;
    double post = 0;
    double ratio;

    for (int i = 0; i < lines.size(); i++) {
      String getPost = lines.get(i).split("   ")[2].split(" ")[0];
      if (getPost.equals("GET")) {
        get++;
      } else {
        post++;
      }
    }
    ratio = get / post;
    return ratio;
  }
}