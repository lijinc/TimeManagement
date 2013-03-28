package com.liji.timeman;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowAppointment extends JFrame {
	private JPanel showAptPane;
	public ShowAppointment() {
		setResizable(false);
		setTitle("Time Management Service");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 249, 304);
		showAptPane = new JPanel();
		showAptPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(showAptPane);
		showAptPane.setLayout(null);
		

		final JTextField text = new JTextField(20);
		text.setText("Date");
		text.setEditable(false);
		text.setToolTipText("Date of meeting");
        JButton b = new JButton("Date");
        final JFrame f = new JFrame();
        f.pack();
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                text.setText(new DatePicker(f).setPickedDate());
        	}
        });
        showAptPane.add(text);
        showAptPane.add(b);
        text.setBounds(12, 0, 140, 28);
        b.setBounds(155, -1, 80, 28);
        
        JButton btnNewButton = new JButton("Appointment_1  At 9:20am");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AddAppointmentFrame AptFrame=new AddAppointmentFrame(0);
    			AptFrame.setVisible(true);
    			dispose();

        	}
        });
        btnNewButton.setForeground(new Color(240, 248, 255));
        btnNewButton.setBackground(new Color(255, 0, 0));
        btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton.setBounds(0, 39, 247, 40);
        showAptPane.add(btnNewButton);
        
        JButton btnAppointmentAtpm = new JButton("Appointment_2  At 11:00am");
        btnAppointmentAtpm.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AddAppointmentFrame addAptFrame=new AddAppointmentFrame(0);
    			addAptFrame.setVisible(true);
    			dispose();

        	}
        });
        btnAppointmentAtpm.setForeground(SystemColor.text);
        btnAppointmentAtpm.setHorizontalAlignment(SwingConstants.LEFT);
        btnAppointmentAtpm.setBackground(new Color(255, 69, 0));
        btnAppointmentAtpm.setBounds(0, 76, 247, 40);
        showAptPane.add(btnAppointmentAtpm);
        
        JButton btnAppointmentAtpm_1 = new JButton("Appointment_3  At 1:20pm");
        btnAppointmentAtpm_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AddAppointmentFrame addAptFrame=new AddAppointmentFrame(0);
    			addAptFrame.setVisible(true);
    			dispose();

        	}
        });
        btnAppointmentAtpm_1.setForeground(SystemColor.text);
        btnAppointmentAtpm_1.setHorizontalAlignment(SwingConstants.LEFT);
        btnAppointmentAtpm_1.setBackground(new Color(255, 140, 0));
        btnAppointmentAtpm_1.setBounds(0, 115, 247, 40);
        showAptPane.add(btnAppointmentAtpm_1);
        
        JButton btnAppointmentAtpm_2 = new JButton("Appointment_4  At 3:20pm");
        btnAppointmentAtpm_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AddAppointmentFrame addAptFrame=new AddAppointmentFrame(0);
    			addAptFrame.setVisible(true);
    			dispose();

        	}
        });
        btnAppointmentAtpm_2.setForeground(new Color(255, 255, 255));
        btnAppointmentAtpm_2.setHorizontalAlignment(SwingConstants.LEFT);
        btnAppointmentAtpm_2.setBackground(new Color(255, 165, 0));
        btnAppointmentAtpm_2.setBounds(0, 154, 247, 40);
        showAptPane.add(btnAppointmentAtpm_2);
        
        JButton btnAppointmentAtpm_3 = new JButton("Appointment_5  At 5:20pm");
        btnAppointmentAtpm_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AddAppointmentFrame addAptFrame=new AddAppointmentFrame(0);
    			addAptFrame.setVisible(true);
    			dispose();

        	}
        });
        btnAppointmentAtpm_3.setForeground(new Color(255, 255, 255));
        btnAppointmentAtpm_3.setHorizontalAlignment(SwingConstants.LEFT);
        btnAppointmentAtpm_3.setBackground(new Color(255, 215, 0));
        btnAppointmentAtpm_3.setBounds(0, 186, 247, 40);
        showAptPane.add(btnAppointmentAtpm_3);
        
        JButton btnNewButton_1 = new JButton("Go Back");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
    			MainFrame addAptFrame=new MainFrame();
    			addAptFrame.setVisible(true);
    			dispose();

        	}
        });
        btnNewButton_1.setBounds(60, 234, 117, 25);
        showAptPane.add(btnNewButton_1);
	}

}
