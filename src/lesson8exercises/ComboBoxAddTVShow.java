package lesson8exercises;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ComboBoxAddTVShow extends JFrame implements ItemListener, ActionListener {

	static JFrame f;
	static JComboBox cb;
	static JLabel l, l1;
	static JTextField tf; 
	
	public static void main(String[] args) {
		f = new JFrame();
		
		ComboBoxAddTVShow tv = new ComboBoxAddTVShow();
		
		f.setLayout(new FlowLayout());
		
		String tv1[] = {"Peaky Blinders", "Arrow", "Stranger Things", "Brooklyn Nine-Nine"};
		
		cb = new JComboBox(tv1);
		tf = new JTextField(16);
		
		JButton b = new JButton("Add"); 
		JButton b1 = new JButton("Remove");
		
		b.setForeground(Color.cyan);
		b1.setForeground(Color.orange);
		
		b.addActionListener(tv);
		b1.addActionListener(tv);
		
		cb.addItemListener(tv);
		
		l = new JLabel("Popular TV Shows");
		l1 = new JLabel(" has been selected");
		
		l.setForeground(Color.red);
		l1.setForeground(Color.black);
		
		JPanel p = new JPanel(new BorderLayout());
		
		p.add(l, BorderLayout.NORTH);
		p.add(cb, BorderLayout.WEST);
		p.add(tf, BorderLayout.CENTER);
		p.add(b, BorderLayout.EAST);
		p.add(b1, BorderLayout.SOUTH);
		
		f.add(p);
		f.setSize(600, 500);
		
		f.show();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if (s.equals("Add")) {
			cb.addItem(tf.getText());
		}
		else {
			cb.removeItem(tf.getText());
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cb) {
			l1.setText(cb.getSelectedItem() + " has been selected");
		}
		
	}

}
