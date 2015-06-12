

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GameStart extends JFrame {

	private static JPanel contentPane;
	private static JLabel title = new JLabel("BLACKJACK");
	private static JLabel label = new JLabel("遊戲人數(2人)");
	private static JButton btnRules = new JButton("Rules");
	private static JButton btnStart = new JButton("START");

	
	GameStart() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		title.setBounds(125, 40, 250, 60);
		contentPane.add(title);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		
		label.setBounds(125, 120, 250, 20);
		contentPane.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		
		
		btnRules.setBounds(100, 210, 100, 40);
		contentPane.add(btnRules);
		
		btnStart.setBounds(300, 210, 100, 40);
		contentPane.add(btnStart);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String playerNum;
				
				new BlackJack();
				

			}
		});
		btnRules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rule Rule = new Rule();
				Rule.setVisible(true);
			}
		});
	}
}





