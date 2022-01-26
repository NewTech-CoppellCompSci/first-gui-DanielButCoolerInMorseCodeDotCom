package lab;

import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) throws Exception {
		
		ArrayList <House> houses = new ArrayList<House>();
		Scanner inFile = new Scanner (new File("src/lab/HouseInfo.txt"));
		
		while (inFile.hasNext()) {
			int squareft = inFile.nextInt();
			double bathrooms = inFile.nextDouble();
			int bedrooms = inFile.nextInt();
			int cost = inFile.nextInt();
			inFile.nextLine();
			String address = inFile.nextLine();
			double lotsize = inFile.nextInt();
			boolean hasPool = inFile.nextBoolean();
			String image = inFile.nextLine();
			houses.add(new House(squareft, bathrooms, bedrooms, cost, address, lotsize, hasPool, image));
		}
		for (int i = 0; i < houses.size(); i++) {
			System.out.println(houses.get(i));
		}
		
		MainPage();
	}
	
	
	public static void MainPage() {
		//Create overall frame
		JFrame frame = new JFrame("Houses For $ale");
		//end program on red 'X' click
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//give it size
		frame.setSize(1200, 1200);
		
		
		//everything else goes here
		
		//add a label (text)
		JLabel label1 = new JLabel("FIRST LABEL!!!");
		label1.setBounds(20, 40, 200, 30);
		frame.add(label1);
		
		//add text field (only 1 line long)
		JTextField field1 = new JTextField("Enter Text Here...");
		field1.setBounds(20, 100, 200, 30);
		frame.add(field1);
		
		//add text areas (Multiple lines long)
		final JTextArea area1 = new JTextArea("Enter Text Here");
		area1.setBounds(260, 100, 200, 100);
		//auto wordWrap
		area1.setLineWrap(true);
		frame.add(area1);
		
		//label for the output
		final JLabel labelOutput = new JLabel(field1.getText());
		labelOutput.setBounds(20, 230, 560, 100);
		frame.add(labelOutput);
		
		//create Button
		JButton button1 = new JButton("Press me!");
		button1.setBounds(260, 40, 140, 30);
		
		
		//action listener
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					labelOutput.setText(area1.getText());
			}
		});
		
		frame.add(button1);
		
		
		//create picture object
		ImageIcon pic1 = new ImageIcon("src/GUIS/N3ON.png");
		//scale picture object
		ImageIcon scaledPic1 = new ImageIcon(pic1.getImage().getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH));
		
		//label with original picture
		JButton label3 = new JButton(pic1);
		label3.setBounds(20, 350, 
				pic1.getIconWidth(), 
				pic1.getIconHeight());
		frame.add(label3);
		
		
		//label with scaled picture
		JLabel label4 = new JLabel(scaledPic1);
		label4.setBounds(500, 350, 
				scaledPic1.getIconWidth(), 
				scaledPic1.getIconHeight());
		frame.add(label4);
		
		//don't use a layout
		frame.setLayout(null);
		
		//Build the frame
		frame.setVisible(true);
	}
}
