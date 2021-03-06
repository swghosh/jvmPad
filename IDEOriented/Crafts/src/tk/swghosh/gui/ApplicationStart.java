package tk.swghosh.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ApplicationStart {

	private JFrame frame;
	private JLabel quote;
	private JButton button;
	
	ApplicationStart() {
		initialize();
	}
	
	public static void main(String[] args) {
		new ApplicationStart();
	}
	
	void initialize() {
		frame = new JFrame("github.com/swghosh | www.swghosh.tk");
		frame.setBounds(100,100,400,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		quote = new JLabel("\"Every fool can know. The point is to understand.\"");
		quote.setHorizontalAlignment(SwingConstants.CENTER);
		quote.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		quote.setBounds(25, 179, 349, 30);
		frame.getContentPane().add(quote);
		
		button = new JButton("Einstein");
		button.setIcon(null);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "www.swghosh.tk\nFollow @ github.com/swghosh");
				quote.setText("Stay calm and keep coding!");
				button.setText("SwG Ghosh");
			}
		});
		button.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		button.setBounds(149, 220, 100, 30);
		frame.getContentPane().add(button);
	}
}

	