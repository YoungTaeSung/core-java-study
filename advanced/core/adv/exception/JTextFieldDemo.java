package core.adv.exception;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class IntOutOfRangeException extends Exception {
    public IntOutOfRangeException (int Bound) {
      super("The input value exceeds the bound " + Bound);
    }
}
class IntField extends JTextField {
    private int bound = Integer.MAX_VALUE;
    public IntField(int size) {
    	super(size);
    }
    public IntField(int size, int max) {
        super(size);
        bound = max;
    }
    public int getInt() throws NumberFormatException, IntOutOfRangeException {
        int num = Integer.parseInt(getText());
        if (num > bound)
            throw new IntOutOfRangeException(bound);
        return num;
    }
}

public class JTextFieldDemo extends JPanel implements ActionListener {

	public static final int WIDTH = 300, HEIGHT = 300;
	  private JLabel prompt = new JLabel("Input an integer <= 100: ");
	  private IntField intField = new IntField(12, 100);
	  private int userInt;
	  private String message = "Hello";

	  public JTextFieldDemo() {
	    add(prompt);
	    intField.addActionListener(this);
	    add(intField);
	    setSize(WIDTH, HEIGHT);
	  }
	  public void paintComponent( Graphics g ) {
	    g.setColor(getBackground());                        // Clear the panel
	    g.fillRect(0, 0, WIDTH, HEIGHT);
	    g.setColor(getForeground());
	    g.drawString(message, 10, 70);
	  }
	  public void actionPerformed(ActionEvent evt) {
	    try {
	      userInt = intField.getInt();
	      message = "You input " + userInt + " Thank you.";
	    } catch (NumberFormatException e) {
	      JOptionPane.showMessageDialog(this,
	       "The input must be an integer. Please reenter.");
	    } catch (IntOutOfRangeException e) {
	      JOptionPane.showMessageDialog(this, e.getMessage());
	    } finally {
	      repaint();
	    }
	  }
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame f = new JFrame("IntField Tester");
			    JTextFieldDemo panel = new JTextFieldDemo();
			    f.getContentPane().add(panel);
			    f.setSize(panel.WIDTH, panel.HEIGHT);
			    f.setVisible(true);
			    //윈도우 리스너 !!
			    f.addWindowListener(new WindowAdapter() {
			      public void windowClosing(WindowEvent e) {
			        System.exit(0);                     
			      }
			    });
			}
		});
	}
}
