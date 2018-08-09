import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
  public static void mainDraw(Graphics graphics) {

    int size = 10;
    for (int i = 1; i < 20; i++) {
      squareDrawing(graphics, i * size, size);
    }
  }

  public static void squareDrawing (Graphics graphics, int x, int size) {
    graphics.setColor(new Color(177,69,243));
    graphics.fillRect(x, x, size, size);
    graphics.setColor(Color.BLACK);
    graphics.drawRect(x, x, size, size);
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
      mainDraw(graphics);
    }
  }
}