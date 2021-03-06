import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
  public static void mainDraw(Graphics graphics) {
    int x = 0;
    int y = 0;
    int size = WIDTH / 8;

    for (int j = 0; j < 8; j++) {
      if (j % 2 == 0) {
        for (int i = 0; i < 8; i++) {
          if (i % 2 == 0) {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(x, y, size, size);
          } else {
            graphics.setColor(Color.WHITE);
            graphics.fillRect(x, y, size, size);
          }
          x = x + WIDTH / 8;
        }
      } else {
        for (int i = 0; i < 8; i++) {
          if (i % 2 == 0) {
            graphics.setColor(Color.WHITE);
            graphics.fillRect(x, y, size, size);

          } else {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(x, y, size, size);
          }
          x = x + WIDTH / 8;
        }
      }
      y = y + WIDTH / 8;
      x = 0;
    }
  }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main (String[]args){
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