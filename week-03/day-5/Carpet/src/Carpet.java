import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Carpet {
  public static void mainDraw(Graphics graphics){
    int size = WIDTH / 3;
    int x = WIDTH / 2 - size / 2;
    int y = HEIGHT / 2 - size / 2;
    drawFractal(x, y, size, graphics);

  }
  public static void fillRect(int x, int y, int size, Graphics graphics) {
    graphics.fillRect(x, y, size, size);
  }

  public static void drawFractal(int x, int y, int size, Graphics graphics) {
    fillRect(x, y, size, graphics);
    if (size > 1) {
      drawFractal(x - size * 2 / 3, y + size / 3, size / 3, graphics);
      drawFractal(x - size * 2 / 3, y + size * 4 / 3, size / 3, graphics);
      drawFractal(x - size * 2 / 3, y - size * 2 / 3, size / 3, graphics);
      drawFractal(x + size / 3, y + size * 4 / 3, size / 3, graphics);
      drawFractal(x + size / 3, y - size * 2 / 3, size / 3, graphics);
      drawFractal(x + size * 4 / 3, y + size / 3, size / 3, graphics);
      drawFractal(x + size * 4 / 3, y + size * 4 / 3, size / 3, graphics);
      drawFractal(x + size * 4 / 3, y - size * 2 / 3, size / 3, graphics);
    }
  }

  // Don't touch the code below
  static int WIDTH = 420;
  static int HEIGHT = 443;

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