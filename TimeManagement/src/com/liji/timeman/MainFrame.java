package com.liji.timeman;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JLabel;
import java.awt.GridLayout;
public class MainFrame extends JFrame {
	private JPanel mainPane;
	protected JPasswordField passwordField;
	private String adminPassword;
	private JLabel lblEnterYourPassword;

	public MainFrame()
	{	
		setResizable(false);
		setTitle("Time Management Service");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 249, 310);
		mainPane = new JPanel();
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPane);
		mainPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Appointment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
    			AddAppointmentFrame addAptFrame=new AddAppointmentFrame(1);
    			addAptFrame.setVisible(true);
    			dispose();

			}
		});
		btnNewButton.setBounds(12, 12, 223, 48);
		mainPane.add(btnNewButton);
		
		JButton btnRemoveAppoinment = new JButton("Show Appoinments");
		btnRemoveAppoinment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
    			ShowAppointment addAptFrame=new ShowAppointment();
    			addAptFrame.setVisible(true);
    			dispose();
			}
		});
		btnRemoveAppoinment.setBounds(12, 64, 223, 48);
		mainPane.add(btnRemoveAppoinment);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddEmployee addAptFrame=new AddEmployee();
    			addAptFrame.setVisible(true);
    			dispose();
			}
		});
		btnAddEmployee.setBounds(12, 116, 223, 48);
		mainPane.add(btnAddEmployee);
		
		JButton btnShowEmployeeDetail = new JButton("Show Employee Detail");
		btnShowEmployeeDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowEmployeeDetails addAptFrame=new ShowEmployeeDetails();
    			addAptFrame.setVisible(true);
    			dispose();
			}
		});
		btnShowEmployeeDetail.setBounds(12, 168, 223, 48);
		mainPane.add(btnShowEmployeeDetail);
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.setBounds(12, 220, 223, 48);
		mainPane.add(btnSettings);
	}

}