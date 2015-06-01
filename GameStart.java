import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.GridLayout;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class GameStart extends JFrame {


	private JPanel contentPane;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameStart frame = new GameStart();
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
	public GameStart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panelTitle = new JPanel();
		contentPane.add(panelTitle);
		panelTitle.setLayout(null);
		
		JLabel lblBlackjack = new JLabel("BLACKJACK");
		lblBlackjack.setBounds(127, 15, 236, 58);
		lblBlackjack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBlackjack.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		panelTitle.add(lblBlackjack);
		
		JPanel panel2 = new JPanel();
		contentPane.add(panel2);
		panel2.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel21 = new JPanel();
		panel2.add(panel21);
		panel21.setLayout(null);
		
		JLabel label = new JLabel("選擇遊戲人數(2~8人)");
		label.setBounds(139, 12, 212, 20);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		panel21.add(label);
		
		JPanel panel22 = new JPanel();
		panel2.add(panel22);
		panel22.setLayout(null);
		
		//int[]
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4", "5", "6", "7", "8"}));
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		comboBox.setBackground(new Color(238, 238, 238));
		
		comboBox.setBounds(211, 8, 68, 27);
		panel22.add(comboBox);
		
		
		JPanel panelB = new JPanel();
		contentPane.add(panelB);
		panelB.setLayout(null);
		
		
		JButton btnRules = new JButton("Rules");
		btnRules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Rule Rule = new Rule();
							Rule.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnRules.setBounds(75, 24, 100, 40);
		panelB.add(btnRules);
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String playerNum;
				//playerNum = textField.getText();    //獲取值
				
//				EventQueue.invokeLater(new Runnable() {
//					public void run() {
//						try {
//							BlackJack frame = new BlackJack();
//							frame.setVisible(true);
//						} catch (Exception e) {
//							e.printStackTrace();
//						}
//					}
//				});
				
//				switch(playerNum) { 
//			    case 2: 
//			        //陳述句一; 
//			        break; 
//			    case 3: 
//			       // 陳述句二; 
//			        break;
//			    case 4: 
//			        //陳述句二; 
//			        break; 
//			    case 5: 
//			        //陳述句二; 
//			        break; 
//			    case 6: 
//			        //陳述句二; 
//			        break; 
//			    case 7: 
//			        //陳述句二; 
//			        break; 
//			    case 8: 
//			        //陳述句二; 
//			        break; 
//			    default: 
//			    	JFrame frame2 = new JFrame("注意!");
//			} 
				
				
			}
		});
		btnStart.setBounds(300, 24, 100, 40);
		panelB.add(btnStart);
	}
}


class Rule extends JFrame{
	
	private JPanel a;
	
	public Rule(){
		setTitle("Rules");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		a = new JPanel();
		a.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(a);
		a.setLayout(null);
				
		JTextArea txtrblackjack = new JTextArea();
		txtrblackjack.setText("21點(Blackjack)基本玩法規則\n"
				+ "\n1. 點數計算\n"
				+ "A 作一點或十一點; 2-10 作該牌之點數; J, Q, K 作十點\n"
				+ "\n2. 發牌\n"
				+ "以順時鐘方向向玩家派發一張暗牌(即不被揭開的牌), 接著以順時鐘方向向玩家派發一張明牌(即被揭開的牌)\n"
				+ "當玩家手上各擁一張暗牌和一張明牌, 以順時鐘方向詢問是否再要牌(以明牌方式派發), 玩家此時要計算是否要牌\n"
				+ "牌局的最終目的, 是要玩家手上擁有的牌總點數達到21點(或最接近又小於21點). \n"
				+ "當一位玩家決定不再要牌後, 才向下一位玩家詢問是否再要牌. \n"
				+ "\n3. 爆煲(超過21點)\n"
				+ "如果玩家要牌後, 其手上擁有的牌的總點數超過21點, 便要揭開手上所擁有的牌, 俗稱爆煲. \n"
				+ "反之若其手上擁有的牌的總點數不超過21點, 該玩家可決定是否繼續要牌. \n"
				+ "當最後一位玩家決定不再要牌後, 所有玩家就必須揭開自己所有手上的牌.\n"
				+ "\n4. 點數決勝\n"
				+ "如果最終沒有爆煲的話, 原來沒有爆煲的眾玩家便要揭開手上所有的牌, 比較點數決定誰勝誰負, 點數較大的取勝. \n"
				+ "\n5. 例牌\n"
				+ "「二十一點」Black Jack 又名為「自然」Black Jack (Natural Black Jack)。\n"
				+ "如果閒家手中的一張暗牌和一張明牌分別是一張A牌（可作11點）和一張十點牌（K、Q、J、10），這副牌叫做二十一點（Black Jack）\n"
				+ "五龍(過五關)\n如果閒家要牌直至手上有5張牌而又沒有爆煲，這副牌叫做五龍. \n此情形可與剛好二十一點同時並存。");
		txtrblackjack.setBounds(10, 10, 780, 500);
		a.add(txtrblackjack);

		JButton buttonClose = new JButton("CLOSE");
		buttonClose.setBounds(300, 520, 200, 40);
		a.add(buttonClose);
		
		buttonClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();	
			}
		});
		
		
	}
	
}

//               GAME

//class BlackJack extends JFrame {
//
//	private JPanel contentPane;
//
//
//	/**
//	 * Create the frame.
//	 */
//	public BlackJack() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 800, 625);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		JPanel panelN = new JPanel();
//		panelN.setBounds(0, 0, 600, 200);
//		contentPane.add(panelN);
//		panelN.setLayout(new GridLayout(1, 3, 0, 0));
//		
//		JPanel panelN1 = new JPanel();
//		panelN.add(panelN1);
//		
//		JPanel panelN2 = new JPanel();
//		panelN.add(panelN2);
//		
//		JPanel panelN3 = new JPanel();
//		panelN.add(panelN3);
//		
//		JPanel panelS = new JPanel();
//		panelS.setBounds(0, 400, 600, 200);
//		contentPane.add(panelS);
//		panelS.setLayout(new GridLayout(1, 3, 0, 0));
//		
//		JPanel panelS1 = new JPanel();
//		panelS.add(panelS1);
//		
//		JPanel panelS2 = new JPanel();
//		panelS.add(panelS2);
//		
//		JPanel panelS3 = new JPanel();
//		panelS.add(panelS3);
//		
//		JPanel panelW = new JPanel();
//		panelW.setBounds(0, 200, 150, 200);
//		contentPane.add(panelW);
//		
//		JPanel panelE = new JPanel();
//		panelE.setBounds(450, 200, 150, 200);
//		contentPane.add(panelE);
//		
//		JPanel panelSET = new JPanel();
//		panelSET.setBounds(600, 0, 200, 600);
//		contentPane.add(panelSET);
//		panelSET.setLayout(null);
//		
//		JButton AddCard = new JButton("加牌");
//		AddCard.setBounds(40, 30, 120, 60);
//		panelSET.add(AddCard);
//		
//		JButton NoAddCard = new JButton("不加牌");
//		NoAddCard.setBounds(40, 120, 120, 60);
//		panelSET.add(NoAddCard);
//		
//		JPanel panelC = new JPanel();
//		panelC.setBounds(150, 200, 300, 200);
//		contentPane.add(panelC);
//	}
//}





