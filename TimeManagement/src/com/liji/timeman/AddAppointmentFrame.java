package com.liji.timeman;

import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JList;

public class AddAppointmentFrame extends JFrame{
	private JPanel addAptPane;
	private JTextField txtNameOfThe;
	private JTextField txtVenueForThe;
	private JTextField txtDuration;
	private JTextField txtStartTime;
	private JTextField txtTitleOfAppointment;
	public AddAppointmentFrame(int flag) {
		setResizable(false);
		setTitle("Time Management Service");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 231, 497);
		addAptPane = new JPanel();
		addAptPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(addAptPane);
		addAptPane.setLayout(null);
		
		txtNameOfThe = new JTextField();
		txtNameOfThe.setText("Name of the Executive");
		txtNameOfThe.setFont(new Font("Arial", Font.PLAIN, 15));
		txtNameOfThe.setBounds(12, 12, 209, 28);
		addAptPane.add(txtNameOfThe);
		txtNameOfThe.setColumns(10);
		
		txtVenueForThe = new JTextField();
		txtVenueForThe.setFont(new Font("Arial", Font.PLAIN, 15));
		txtVenueForThe.setText("Venue for the Meeting");
		txtVenueForThe.setBounds(12, 74, 209, 28);
		addAptPane.add(txtVenueForThe);
		txtVenueForThe.setColumns(10);
		
		JSpinner timeSpinner = new JSpinner( new SpinnerDateModel() );
		timeSpinner.setBounds(141, 166, 80, 28);
		JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinner, "HH:mm:ss");
		timeSpinner.setEditor(timeEditor);
		timeSpinner.setValue(new Date(System.currentTimeMillis()));
		addAptPane.add(timeSpinner);
		
		JSpinner tSpinner = new JSpinner( new SpinnerDateModel() );
		tSpinner.setBounds(141, 105, 80, 28);
		JSpinner.DateEditor tEditor = new JSpinner.DateEditor(tSpinner, "HH:mm:ss");
		tSpinner.setEditor(tEditor);
		tSpinner.setValue(new Date(System.currentTimeMillis()));
		addAptPane.add(tSpinner);
		
		final JTextField text = new JTextField(20);
		text.setText("Date");
		text.setEditable(false);
		text.setToolTipText("Date of meeting");
        JButton b = new JButton("Date");
        addAptPane.add(text);
        addAptPane.add(b);
        text.setFont(new Font("Arial", Font.PLAIN, 15));
        text.setBounds(12, 136, 126, 28);
        final JFrame f = new JFrame();
        f.pack();
        f.setVisible(true);
        b.setBounds(141, 136, 80, 28);
        
        JTextArea txtrPurpose = new JTextArea();
        txtrPurpose.setText("Purpose of the Meeting");
        txtrPurpose.setBounds(0, 19, 209, 146);
        addAptPane.add(txtrPurpose);        
        JScrollPane sbrText = new JScrollPane(txtrPurpose);
        sbrText.setBounds(12, 197, 209, 146);
        sbrText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        sbrText.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        addAptPane.add(sbrText);
        
        String labels[] = { "EMP_A", "EMP_B", "EMP_C", "EMP_D","EMP_E", "EMP_F", "EMP_G", "EMP_H","EMP_I", "EMP_J" };

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JList list = new JList(labels);
        list.setSelectionModel(new DefaultListSelectionModel() {
            @Override
            public void setSelectionInterval(int index0, int index1) {
                if(super.isSelectedIndex(index0)) {
                    super.removeSelectionInterval(index0, index1);
                }
                else {
                    super.addSelectionInterval(index0, index1);
                }
            }
        });
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setToolTipText("Select Executives for meeting");
        scrollPane.setSize(209, 58);
        scrollPane.setLocation(12, 344);
        addAptPane.add(scrollPane);
        txtDuration = new JTextField();
        txtDuration.setEditable(false);
        txtDuration.setText("End Time");
        txtDuration.setBounds(12, 166, 126, 28);
        addAptPane.add(txtDuration);
        JButton btnNewButton;
        txtDuration.setColumns(10);
        if(flag==0){
            btnNewButton = new JButton("Done");
        }
        else{
            btnNewButton = new JButton("Add Appointment");
        }
        btnNewButton.setBounds(12, 404, 209, 28);
        addAptPane.add(btnNewButton);
        
        txtStartTime = new JTextField();
        txtStartTime.setEditable(false);
        txtStartTime.setText("Start Time");
        txtStartTime.setBounds(12, 105, 126, 28);
        addAptPane.add(txtStartTime);
        txtStartTime.setColumns(10);
        
        txtTitleOfAppointment = new JTextField();
        txtTitleOfAppointment.setText("Title of Appointment");
        txtTitleOfAppointment.setFont(new Font("Arial", Font.PLAIN, 15));
        txtTitleOfAppointment.setColumns(10);
        txtTitleOfAppointment.setBounds(12, 43, 209, 28);
        addAptPane.add(txtTitleOfAppointment);
        
        JButton btnNewButton_1 = new JButton("Delete");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        if(flag!=0){
        	btnNewButton_1.setVisible(false);
        }
        btnNewButton_1.setBounds(12, 435, 209, 28);
        addAptPane.add(btnNewButton_1);
        btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
    			MainFrame addAptFrame=new MainFrame();
    			addAptFrame.setVisible(true);
    			dispose();
			}
		});
        b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                text.setText(new DatePicker(f).setPickedDate());
			}
		});
	}
}
