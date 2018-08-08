import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){

    int r = (int)(Math.random() * 255);
    int g = (int)(Math.random() * 255);
    int b = (int)(Math.random() * 255);
    int x = (int)(Math.random() * WIDTH);
    int y = (int)(Math.random() * HEIGHT);

    for (int i = 0; i < 4; i++) {
      graphics.setColor(new Color (r, g, b));
      graphics.fillRect(x, y, x, y);
    }
  }

  //    Don't touch the code below
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}