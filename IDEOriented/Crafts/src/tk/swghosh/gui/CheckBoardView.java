package tk.swghosh.gui;

import javax.swing.*;
import java.awt.*;
import tk.swghosh.guimodel.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckBoardView {

	private JFrame frame;
	private JButton[][] buttons;
	private CheckBoard cb;
	private byte[][] matrix;
	private JLabel userScore1;
	private JLabel userScore2;
	private JLabel footer;
	private JLabel labelRed;
	private JLabel labelBlue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new CheckBoardView();
	}

	/**
	 * Create the application.
	 */
	public CheckBoardView() {
		init();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void init() {
		frame = new JFrame("Check Board");
		frame.setBounds(100, 100, 600, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		userScore1 = new JLabel("0");
		userScore1.setForeground(Color.RED);
		userScore1.setFont(new Font("Segoe UI Light", Font.PLAIN, 35));
		userScore1.setHorizontalAlignment(SwingConstants.CENTER);
		userScore1.setBounds(480, 110, 95, 80);
		frame.getContentPane().add(userScore1);
		
		userScore2 = new JLabel("0");
		userScore2.setHorizontalAlignment(SwingConstants.CENTER);
		userScore2.setForeground(Color.BLUE);
		userScore2.setFont(new Font("Segoe UI Light", Font.PLAIN, 35));
		userScore2.setBounds(480, 200, 95, 80);
		frame.getContentPane().add(userScore2);
		
		footer = new JLabel("checkboard game...");
		footer.setToolTipText("https://github.com/swghosh/bytec/blob/master/eclipse_space/Crafts/src/tk/swghosh/gui/CheckBoard.java");
		footer.setHorizontalAlignment(SwingConstants.RIGHT);
		footer.setBounds(352, 466, 223, 34);
		frame.getContentPane().add(footer);
		
		labelRed = new JLabel("Red Score");
		labelRed.setBounds(480, 110, 72, 14);
		frame.getContentPane().add(labelRed);
		
		labelBlue = new JLabel("Blue Score");
		labelBlue.setBounds(480, 201, 72, 14);
		frame.getContentPane().add(labelBlue);
		frame.setVisible(true);
		
		cb = new CheckBoard();
		
		matrix = cb.getContents();
		
		buttons = new JButton[8][8];
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				buttons[i][j] = new JButton();
				buttons[i][j].setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
				frame.getContentPane().add(buttons[i][j]);
				buttons[i][j].setBounds((50 * ( j + 1 ) ), (50 * ( i + 1 ) ), 50, 50 );
				final int rin = i; final int cin = j;
				buttons[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						cb.move(rin, cin);
						update();
					}
				});
			}
		}
		update();
	}
	
	private void update() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(matrix[i][j] == 0) {
					buttons[i][j].setText("");
				}
				else if(matrix[i][j] == 1) {
					buttons[i][j].setText("O");
					buttons[i][j].setForeground(Color.RED);
				}
				else if(matrix[i][j] == 2) {
					buttons[i][j].setText("O");
					buttons[i][j].setForeground(Color.BLUE);
				}
			}
		}
		int score[] = cb.score();
		userScore1.setText(Integer.toString(score[0]));
		userScore2.setText(Integer.toString(score[1]));
	}
}
