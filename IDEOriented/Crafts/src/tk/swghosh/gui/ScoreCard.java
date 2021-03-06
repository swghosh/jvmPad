package tk.swghosh.gui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ScoreCard {

	private JFrame frame;
	private JLabel lblScore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new ScoreCard();
	}

	/**
	 * Create the application.
	 */
	public ScoreCard() {
		init();
	}

	/**
	 * Initialize the application.
	 */
	private void init() {
		frame = new JFrame("Score Card | github.com/swghosh");
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblTitle = new JLabel("Blue Team Score");
		lblTitle.setFont(new Font("Helvetica", Font.PLAIN, 11));
		lblTitle.setBounds(55, 80, 79, 14);
		frame.getContentPane().add(lblTitle);
		
		lblScore = new JLabel("0");
		lblScore.setForeground(Color.BLUE);
		lblScore.setFont(new Font("Helvetica", Font.PLAIN, 65));
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setBounds(281, 127, 143, 123);
		frame.getContentPane().add(lblScore);
		
		JButton btnIncrement = new JButton("+");
		btnIncrement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n = Integer.parseInt(lblScore.getText());
				lblScore.setText(Integer.toString(n+1));
			}
		});
		btnIncrement.setFont(new Font("Helvetica", Font.PLAIN, 9));
		btnIncrement.setBounds(55, 105, 40, 20);
		frame.getContentPane().add(btnIncrement);
		
		JButton btnDecrement = new JButton("-");
		btnDecrement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n = Integer.parseInt(lblScore.getText());
				lblScore.setText(Integer.toString(n-1));
			}
		});
		btnIncrement.setFont(new Font("Helvetica", Font.PLAIN, 9));
		btnDecrement.setBounds(105, 105, 40, 20);
		frame.getContentPane().add(btnDecrement);
		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "www.swghosh.tk\nFollow @ github.com/swghosh");
			}
		});
		btnAbout.setFont(new Font("Helvetica", Font.PLAIN, 12));
		btnAbout.setBounds(324, 11, 100, 30);
		frame.getContentPane().add(btnAbout);
		
	}
}
