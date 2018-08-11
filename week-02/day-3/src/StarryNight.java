import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void mainDraw(Graphics graphics) {
    Random random = new Random();
    for (int i = 0; i < 500; i++) {
      int starSize = 3;
      int starColor = random.nextInt(256);
      int x = random.nextInt(WIDTH);
      int y = random.nextInt(HEIGHT);
      graphics.setColor(new Color(starColor, starColor, starColor));
      graphics.fillRect(x, y, starSize, starSize);
    }
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.BLACK);
      mainDraw(graphics);
    }
  }
}