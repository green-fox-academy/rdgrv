import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    Path path = Paths.get("assets/logs.txt");
    ArrayList<String> lines = new ArrayList<>();
    try {
      lines.addAll(Files.readAllLines(path));
    } catch (Exception e) {
    }
    System.out.println(ipAddress(lines));
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
}

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
