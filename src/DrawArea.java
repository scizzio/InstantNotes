import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DrawArea extends JComponent  {
 
  private Image image;
  private Graphics2D g2;
  private int X1, Y1, X0, Y0, r;
 
  public DrawArea() {
    setDoubleBuffered(false);
    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        X0 = e.getX();
        Y0 = e.getY();
      }
    });
 
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        X1 = e.getX();
        Y1 = e.getY();
 
        if (g2 != null) {
          g2.drawLine(X0, Y0, X1, Y1);
          repaint();
          X0 = X1;
          Y0 = Y1;

        }
      }
    });
  }
 
  protected void paintComponent(Graphics g) {
    if (image == null) {
 
      image = createImage(getSize().width, getSize().height);
      g2 = (Graphics2D) image.getGraphics();
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      clear();
    }
 
    g.drawImage(image, 0, 0, null);
  }
  public void clear() {
    g2.setPaint(Color.white);
    g2.fillRect(0, 0, getSize().width, getSize().height);
    g2.setPaint(Color.black);
    repaint();
  }
 
  public void red() {
    g2.setPaint(Color.red);
  }
 
  public void black() {
    g2.setPaint(Color.black);
  }
 
  public void magenta() {
    g2.setPaint(Color.magenta);
  }
 
  public void blue() {
    g2.setPaint(Color.blue);
  }
 public void eraser() {
	 g2.setPaint(Color.white);
 }
}