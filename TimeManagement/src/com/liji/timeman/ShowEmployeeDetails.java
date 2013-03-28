package com.liji.timeman;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowEmployeeDetails extends JFrame {
	private JPanel mainPane;
	ShowEmployeeDetails(){
		setResizable(false);
		setTitle("Time Management Service");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 249, 310);
		mainPane = new JPanel();
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPane);
		mainPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Employee_Name");
		btnNewButton.setBackground(new Color(173, 255, 47));
		btnNewButton.setBounds(12, 0, 223, 36);
		mainPane.add(btnNewButton);
		
		JButton button = new JButton("Employee_Name");
		button.setBackground(new Color(173, 255, 47));
		button.setBounds(12, 41, 223, 36);
		mainPane.add(button);
		
		JButton button_1 = new JButton("Employee_Name");
		button_1.setBackground(new Color(173, 255, 47));
		button_1.setBounds(12, 84, 223, 36);
		mainPane.add(button_1);
		
		JButton button_2 = new JButton("Employee_Name");
		button_2.setBackground(new Color(173, 255, 47));
		button_2.setBounds(12, 128, 223, 36);
		mainPane.add(button_2);
		
		JButton button_3 = new JButton("Employee_Name");
		button_3.setBackground(new Color(173, 255, 47));
		button_3.setBounds(12, 172, 223, 36);
		mainPane.add(button_3);
		
		JButton btnNewButton_1 = new JButton("Go Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame addAptFrame=new MainFrame();
    			addAptFrame.setVisible(true);
    			dispose();
			}
		});
		btnNewButton_1.setBounds(65, 224, 117, 25);
		mainPane.add(btnNewButton_1);
	}
}
