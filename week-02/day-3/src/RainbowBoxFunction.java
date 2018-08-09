import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {

    String[] rainbow = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
    int size = HEIGHT;

    for (int i = 6; i >= 0; i--) {
      rainbow(graphics, size, rainbow[i]);
      size -= 40;
    }
  }

  public static void rainbow(Graphics graphics, int x, String c) {

    switch (c) {
      case "red":
        Color red = new Color(255, 0, 0);
        graphics.setColor(red);
        break;
      case "orange":
        Color orange = new Color(255, 127, 0);
        graphics.setColor(orange);
        break;
      case "yellow":
        Color yellow = new Color(255, 255, 0);
        graphics.setColor(yellow);
        break;
      case "green":
        Color green = new Color(0, 255, 0);
        graphics.setColor(green);
        break;
      case "blue":
        Color blue = new Color(0, 0, 255);
        graphics.setColor(blue);
        break;
      case "indigo":
        Color indigo = new Color(75, 0, 130);
        graphics.setColor(indigo);
        break;
      case "violet":
        Color violet = new Color(143, 0, 255);
        graphics.setColor(violet);
        break;
    }

    graphics.fillRect(WIDTH / 2 - x / 2, HEIGHT / 2 - x / 2, x, x);
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