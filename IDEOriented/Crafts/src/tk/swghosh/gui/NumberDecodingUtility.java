package tk.swghosh.gui;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NumberDecodingUtility {

	private JFrame frame;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new NumberDecodingUtility();
	}

	/**
	 * Create the application.
	 */
	public NumberDecodingUtility() {
		init();
	}
	
	private long decode(String str) {
		String[] lines = str.split("\n");
		long out = 0;
		for(String line:lines) {
			int ctr = 0;
			for(int i = 0; i < line.length(); i++) {
				if(line.charAt(i) == '.') {
					ctr++;
				}
			}
			out = (out * 10) + ctr;
		}
		return out;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void init() {
		frame = new JFrame("Number Decoding Utility");
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textArea.setBounds(10, 11, 414, 317);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("Decode");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = textArea.getText();
				String out = new Long(decode(str)).toString();
				JOptionPane.showMessageDialog(null, "Decode Successful.\n" + out);
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		btnNewButton.setBounds(313, 339, 89, 29);
		frame.getContentPane().add(btnNewButton);
		frame.setVisible(true);
	}
}
