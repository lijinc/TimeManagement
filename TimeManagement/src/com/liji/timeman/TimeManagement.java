package com.liji.timeman;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.liji.timeman.MainFrame;

public class TimeManagement {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		      public void run() {
		      MainFrame mainframe=new MainFrame();
		      mainframe.setVisible(true);
		      mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      }
		});
	}
}
