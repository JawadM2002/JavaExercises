package lesson8exercises;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEvent implements ActionListener {
	Container c;
	
	public ButtonEvent() {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // it will exit the frame on close
		f.setBounds(100, 50, 500, 500);
		c = f.getContentPane();
		
		c.setLayout(null);
		JButton b = new JButton("Change Colour");
		b.setBounds(100, 100, 150, 30);
		
		c.add(b);
		b.addActionListener(this);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		ButtonEvent be = new ButtonEvent();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		c.setBackground(Color.blue); // when the button is pressed, it will change the colour to blue
		
	}

}
