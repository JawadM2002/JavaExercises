package lesson8exercises;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ProgrammingLanguagesandTheirYear {
	
	JFrame f;
	JTable t;
	ProgrammingLanguagesandTheirYear(){
		f = new JFrame(); // initialises frame
		f.setTitle("Programming Languages and their years");
		

		String[][] info = { 
				{"C", "1972", "Dennis Ritchie"},
				{"C++", "1980", "Bjarne Stroustrup"},
				{"Python", "1991", "Guido van Rossum"},
				{"Java", "1995", "James Gosling"},
				{"JavaScript", "1995", "Brandon Eich"},
				{"C#", "2001", "Mads Torgersen"}
		}; // data for the table
				
		String[] nameOfColumn = {"Language", "Year", "Developer"};
		
		t = new JTable(info, nameOfColumn); // initialises JTable
		t.setBounds(35, 45, 200, 300);
		
		JScrollPane sp = new JScrollPane(t);// adds to JScrollPane 
		f.add(sp);
		f.setSize(550, 250);
		f.setVisible(true);
		};

	public static void main(String[] args) {
		new ProgrammingLanguagesandTheirYear();

	}

}

