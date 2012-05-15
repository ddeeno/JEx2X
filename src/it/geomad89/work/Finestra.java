package it.geomad89.work;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Finestra implements Runnable{

	private JFrame frame;
	private JTextField textField;
	/**
	 * Create the application.
	 */
	public Finestra() {
		initialize();
	}
	
	public void run() {
		
		try {
			Finestra window = new Finestra();
			window.visible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 140);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblSelezionaFile = new JLabel("Seleziona file");
		lblSelezionaFile.setBounds(10, 20, 96, 15);
		panel.add(lblSelezionaFile);
		
		textField = new JTextField();
		textField.setBounds(10, 55, 385, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("...");
		button.setBounds(400, 55, 40, 20);
		panel.add(button);
		
		JButton btnVai = new JButton("converti");
		btnVai.setBounds(165, 95, 120, 25);
		panel.add(btnVai);
	}
	
	public void visible(boolean b) {
		
		this.frame.setVisible(true);
	}
}
