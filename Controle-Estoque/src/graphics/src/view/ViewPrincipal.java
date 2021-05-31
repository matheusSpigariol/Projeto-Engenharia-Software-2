package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewPrincipal extends JFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPrincipal frame = new ViewPrincipal();
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
	public ViewPrincipal() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(346, 249, 300, 97);
		getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(346, 41, 300, 49);
		getContentPane().add(textField);
		textField.setColumns(10);
	}
}
