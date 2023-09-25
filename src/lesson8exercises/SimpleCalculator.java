package lesson8exercises;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldnum1;
	private JTextField textFieldnum2;
	private JButton btnMultiplication;
	private JButton btnDivision;
	private JLabel lblNewLabel;
	private JTextField textFieldAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator frame = new SimpleCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SimpleCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldnum1 = new JTextField();
		textFieldnum1.setBounds(58, 34, 274, 89);
		contentPane.add(textFieldnum1);
		textFieldnum1.setColumns(10);
		
		textFieldnum2 = new JTextField();
		textFieldnum2.setColumns(10);
		textFieldnum2.setBounds(371, 34, 274, 89);
		contentPane.add(textFieldnum2);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldnum1.getText());
					num2 = Integer.parseInt(textFieldnum2.getText());
					ans = Integer.parseInt(textFieldnum1.getText());
					ans = num1 + num2;
					textFieldAnswer.setText(Integer.toString(ans));
					
				} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Enter valid number");
					}
				}
				
		});
		btnAdd.setBounds(92, 139, 205, 72);
		contentPane.add(btnAdd);
		
		JButton btnSubtact = new JButton("Subtract");
		btnSubtact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldnum1.getText());
					num2 = Integer.parseInt(textFieldnum2.getText());
					ans = Integer.parseInt(textFieldnum1.getText());
					ans = num1 - num2;
					textFieldAnswer.setText(Integer.toString(ans));
					
				} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Enter valid number");
					}
				}
		});
		btnSubtact.setBounds(405, 139, 205, 72);
		contentPane.add(btnSubtact);
		
		btnMultiplication = new JButton("Multiplication");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldnum1.getText());
					num2 = Integer.parseInt(textFieldnum2.getText());
					ans = Integer.parseInt(textFieldnum1.getText());
					ans = num1 * num2;
					textFieldAnswer.setText(Integer.toString(ans));
					
				} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Enter valid number");
					}
				}
		});
		btnMultiplication.setBounds(92, 248, 205, 72);
		contentPane.add(btnMultiplication);
		
		btnDivision = new JButton("Division");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldnum1.getText());
					num2 = Integer.parseInt(textFieldnum2.getText());
					ans = Integer.parseInt(textFieldnum1.getText());
					ans = num1 / num2;
					textFieldAnswer.setText(Integer.toString(ans));
					
				} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Enter valid number");
					}
				}
		});
		btnDivision.setBounds(405, 248, 205, 72);
		
		contentPane.add(btnDivision);
		
		lblNewLabel = new JLabel("Answer");
		lblNewLabel.setBounds(136, 354, 49, 14);
		contentPane.add(lblNewLabel);
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.setBounds(207, 339, 151, 44);
		contentPane.add(textFieldAnswer);
		textFieldAnswer.setColumns(10);
	}

}
