package com.liji.timeman;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddEmployee extends JFrame {
	private JPanel mainPane;
	private JTextField txtName;
	private JTextField txtCode;
	private JTextField txtEmailId;
	private JTextField txtPosition;
	private JButton button;
	AddEmployee(){
		setResizable(false);
		setTitle("Time Management Service");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 249, 224);
		mainPane = new JPanel();
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPane);
		mainPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setText("Name:");
		txtName.setBounds(12, 0, 223, 27);
		mainPane.add(txtName);
		txtName.setColumns(10);
		
		txtCode = new JTextField();
		txtCode.setText("Employee Code");
		txtCode.setColumns(10);
		txtCode.setBounds(12, 31, 223, 27);
		mainPane.add(txtCode);
		
		txtEmailId = new JTextField();
		txtEmailId.setText("Email ID");
		txtEmailId.setColumns(10);
		txtEmailId.setBounds(12, 61, 223, 27);
		mainPane.add(txtEmailId);
		
		txtPosition = new JTextField();
		txtPosition.setText("Position");
		txtPosition.setColumns(10);
		txtPosition.setBounds(12, 94, 223, 27);
		mainPane.add(txtPosition);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame addAptFrame=new MainFrame();
    			addAptFrame.setVisible(true);
    			dispose();
			}
		});
		btnNewButton.setBounds(12, 126, 223, 25);
		mainPane.add(btnNewButton);
		
		button = new JButton("Go Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame addAptFrame=new MainFrame();
    			addAptFrame.setVisible(true);
    			dispose();
			}
		});
		button.setBounds(12, 157, 223, 25);
		mainPane.add(button);
	}
}
