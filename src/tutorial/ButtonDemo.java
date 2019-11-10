package tutorial;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo implements ActionListener {
	
	JLabel jlab;
	
	ButtonDemo(){
	
	
	JFrame jfrm = new JFrame("Button example");
	
	jfrm.setLayout(new FlowLayout());
	
	jfrm.setSize(220, 90);
	
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JButton jbtnUp = new JButton("Up");
	JButton jbtnDown = new JButton("Down");
	
	jbtnUp.addActionListener(this);
	jbtnDown.addActionListener(this);
	
	jfrm.add(jbtnUp);
	jfrm.add(jbtnDown);
	
	jlab = new JLabel("Press a button");
	
	jfrm.add(jlab);
	
	jfrm.setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("Up"))
			jlab.setText(" Up button pressed");
		else
			jlab.setText(" Down button pressed");
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new ButtonDemo();
			}
		});
	}

}
