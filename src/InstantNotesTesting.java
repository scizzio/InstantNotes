
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class InstantNotesTesting {
 
  JButton clearBtn, blackBtn, blueBtn, redBtn, magentaBtn, eraserBtn;
  DrawArea drawArea;
  ActionListener actionListener = new ActionListener() {
 
  public void actionPerformed(ActionEvent e) {
      if (e.getSource() == clearBtn) {
        drawArea.clear();
      } else if (e.getSource() == blackBtn) {
        drawArea.black();
      } else if (e.getSource() == blueBtn) {
        drawArea.blue();
      } else if (e.getSource() == redBtn) {
        drawArea.red();
      } else if (e.getSource() == magentaBtn) {
        drawArea.magenta();
      }
      else if (e.getSource() == eraserBtn) {
          drawArea.eraser();
        }  
  }
  };
 
  public static void main(String[] args) {
    new InstantNotesTesting().show();
  }
  public void show() {
    JFrame frame = new JFrame("Instant Notes");
    Container content = frame.getContentPane();
    content.setLayout(new BorderLayout());
    drawArea = new DrawArea();
    content.add(drawArea, BorderLayout.CENTER);
    JPanel controls = new JPanel();
    clearBtn = new JButton("Clear");
    clearBtn.addActionListener(actionListener);
    blackBtn = new JButton("Black");
    blackBtn.addActionListener(actionListener);
    blueBtn = new JButton("Blue");
    blueBtn.addActionListener(actionListener);
    redBtn = new JButton("Red");
    redBtn.addActionListener(actionListener);
    magentaBtn = new JButton("Magenta");
    magentaBtn.addActionListener(actionListener);
    eraserBtn = new JButton("Eraser");
    eraserBtn.addActionListener(actionListener);
    controls.add(blueBtn);
    controls.add(blackBtn);
    controls.add(redBtn);
    controls.add(magentaBtn);
    controls.add(clearBtn);
    controls.add(eraserBtn);
    content.add(controls, BorderLayout.NORTH);
    JLabel label = new JLabel("Powered by Travis Numpa. Student ID : 6322771641");
    content.add(label, BorderLayout.SOUTH);
    frame.setSize(600, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
 
}