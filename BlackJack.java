import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;


public class BlackJack extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlackJack frame = new BlackJack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	final int FINAL_CARDS_NUMBER = 52;

    ImageIcon[] CARDS  = new ImageIcon [FINAL_CARDS_NUMBER];
        
    ArrayList<ImageIcon> list = new ArrayList<ImageIcon>();

	
	DeckOfCards card = new DeckOfCards();


//	JLabel picture1 ;
//	JLabel picture2 ;
//	JLabel picture3 ;
//	JLabel picture4 ;
//	JLabel picture5 ;
//	JLabel picture6 ;
//	JLabel picture7 ;
//	JLabel picture8 ;
//	JLabel picture9 ;
//	JLabel picture10 ;
//	JLabel picture11 ;
//	JLabel picture12 ;
//	JLabel picture13 ;
//	JLabel picture14 ;
//	JLabel picture15 ;
//	JLabel picture16 ;
//	JLabel picture17 ;
//	JLabel picture18 ;
//	JLabel picture19 ;
//	JLabel picture20 ;
//	JLabel picture21 ;
//	JLabel picture22 ;
//	JLabel picture23 ;
//	JLabel picture24 ;
//	JLabel picture25 ;
//	JLabel picture26 ;
//	JLabel picture27 ;
//	JLabel picture28 ;
//	JLabel picture29 ;
//	JLabel picture30 ;
//	JLabel picture31 ;
//	JLabel picture32 ;
//	JLabel picture33 ;
//	JLabel picture34 ;
//	JLabel picture35 ;
//	JLabel picture36 ;
//	JLabel picture37 ;
//	JLabel picture38 ;
//	JLabel picture39 ;
//	JLabel picture40 ;
//	JLabel picture41 ;
//	JLabel picture42 ;
//	JLabel picture43 ;
//	JLabel picture44 ;
//	JLabel picture45 ;
//	JLabel picture46 ;
//	JLabel picture47 ;
//	JLabel picture48 ;
//	JLabel picture49 ;
//	JLabel picture50 ;
//	JLabel picture51 ;
//	JLabel picture52 ;

	
	

	/**
	 * Create the frame.
	 */
	public BlackJack() {
		
		
		for(int i = 0; i <FINAL_CARDS_NUMBER; i++){
            CARDS[i] = new ImageIcon("/Users/wayne/Documents/workspace/104BlackJack/picture/card/" + (i + 1) + ".png");
            
            
            list.add(CARDS[i]);
        }
		

//        picture5 = new JLabel(list.get(card1[4]));
//        picture6 = new JLabel(list.get(card1[5]));
//        picture7 = new JLabel(list.get(card1[6]));
//        picture8 = new JLabel(list.get(card1[7]));
//        picture9 = new JLabel(list.get(card1[8]));
//        picture10 = new JLabel(list.get(card1[9]));
//        picture11 = new JLabel(list.get(card1[10]));
//        picture12 = new JLabel(list.get(card1[11]));
//        picture13 = new JLabel(list.get(card1[12]));
//        picture14 = new JLabel(list.get(card1[13]));
//        picture15 = new JLabel(list.get(card1[14]));
//        picture16 = new JLabel(list.get(card1[15]));
//        picture17 = new JLabel(list.get(card1[16]));
//        picture18 = new JLabel(list.get(card1[17]));
//        picture19 = new JLabel(list.get(card1[18]));
//        picture20 = new JLabel(list.get(card1[19]));
//        picture21 = new JLabel(list.get(card1[20]));
//        picture22 = new JLabel(list.get(card1[21]));
//        picture23 = new JLabel(list.get(card1[22]));
//        picture24 = new JLabel(list.get(card1[23]));
//        picture25 = new JLabel(list.get(card1[24]));
//        picture26 = new JLabel(list.get(card1[25]));
//        picture27 = new JLabel(list.get(card1[26]));
//        picture28 = new JLabel(list.get(card1[27]));
//        picture29 = new JLabel(list.get(card1[28]));
//        picture30 = new JLabel(list.get(card1[29]));
//        picture31 = new JLabel(list.get(card1[30]));
//        picture32 = new JLabel(list.get(card1[31]));
//        picture33 = new JLabel(list.get(card1[32]));
//        picture34 = new JLabel(list.get(card1[33]));
//        picture35 = new JLabel(list.get(card1[34]));
//        picture36 = new JLabel(list.get(card1[35]));
//        picture37 = new JLabel(list.get(card1[36]));
//        picture38 = new JLabel(list.get(card1[37]));
//        picture39 = new JLabel(list.get(card1[38]));
//        picture40 = new JLabel(list.get(card1[39]));
//        picture41 = new JLabel(list.get(card1[40]));
//        picture42 = new JLabel(list.get(card1[41]));
//        picture43 = new JLabel(list.get(card1[42]));
//        picture44 = new JLabel(list.get(card1[43]));
//        picture45 = new JLabel(list.get(card1[44]));
//        picture46 = new JLabel(list.get(card1[45]));
//        picture47 = new JLabel(list.get(card1[46]));
//        picture48 = new JLabel(list.get(card1[47]));
//        picture49 = new JLabel(list.get(card1[48]));
//        picture50 = new JLabel(list.get(card1[49]));
//        picture51 = new JLabel(list.get(card1[50]));
//        picture52 = new JLabel(list.get(card1[51]));
		
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelN = new JPanel();
		panelN.setBounds(0, 0, 600, 200);
		contentPane.add(panelN);
		panelN.setLayout(new GridLayout(1, 3, 0, 0));
		
		JPanel panelN1 = new JPanel();
		panelN1.setForeground(new Color(0, 0, 0));
		panelN.add(panelN1);
		panelN1.setBorder(new LineBorder(Color.black, 1));
		panelN1.setLayout(null);
		
		JLabel lblPlayer_5 = new JLabel("player 6");
		lblPlayer_5.setBounds(6, 6, 61, 16);
		panelN1.add(lblPlayer_5);
		
		JPanel panelN2 = new JPanel();
		panelN.add(panelN2);
		panelN2.setBorder(new LineBorder(Color.black, 1));
		panelN2.setLayout(null);
		
		JLabel lblPlayer_4 = new JLabel("player 5");
		lblPlayer_4.setBounds(6, 6, 61, 16);
		panelN2.add(lblPlayer_4);
		
		JPanel panelN3 = new JPanel();
		panelN.add(panelN3);
		panelN3.setBorder(new LineBorder(Color.black, 1));
		panelN3.setLayout(null);
		
		JLabel lblPlayer_3 = new JLabel("player 4");
		lblPlayer_3.setBounds(6, 6, 61, 16);
		panelN3.add(lblPlayer_3);
		
		JPanel panelS = new JPanel();
		panelS.setBounds(0, 400, 600, 200);
		contentPane.add(panelS);
		panelS.setLayout(new GridLayout(1, 3, 0, 0));
		
		JPanel panelS1 = new JPanel();
		panelS.add(panelS1);
		panelS1.setBorder(new LineBorder(Color.black, 1));
		panelS1.setLayout(null);
		
		JLabel lblPlayer_7 = new JLabel("player 8");
		lblPlayer_7.setBounds(6, 6, 61, 16);
		panelS1.add(lblPlayer_7);
		
		JPanel panelS2 = new JPanel();
		panelS.add(panelS2);
		panelS2.setBorder(new LineBorder(Color.black, 1));
		panelS2.setLayout(null);
		
		JLabel lblPlayer = new JLabel("player 1");
		lblPlayer.setBounds(6, 6, 61, 16);
		panelS2.add(lblPlayer);
		
		JPanel panelS3 = new JPanel();
		panelS.add(panelS3);
		panelS3.setBorder(new LineBorder(Color.black, 1));
		panelS3.setLayout(null);
		
		JLabel lblPlayer_1 = new JLabel("player 2");
		lblPlayer_1.setBounds(6, 6, 61, 16);
		panelS3.add(lblPlayer_1);
		
		JPanel panelW = new JPanel();
		panelW.setForeground(Color.BLACK);
		panelW.setBounds(0, 200, 150, 200);
		contentPane.add(panelW);
		panelW.setBorder(new LineBorder(Color.black, 1));
		panelW.setLayout(null);
		
		JLabel lblPlayer_6 = new JLabel("player 7");
		lblPlayer_6.setBounds(6, 6, 61, 16);
		panelW.add(lblPlayer_6);
		
		JPanel panelE = new JPanel();
		panelE.setBounds(450, 200, 150, 200);
		contentPane.add(panelE);
		panelE.setBorder(new LineBorder(Color.black, 1));
		panelE.setLayout(null);
		
		JLabel lblPlayer_2 = new JLabel("player 3");
		lblPlayer_2.setBounds(6, 6, 61, 16);
		panelE.add(lblPlayer_2);
		
		JPanel panelSET = new JPanel();
		panelSET.setBounds(600, 0, 200, 600);
		contentPane.add(panelSET);
		panelSET.setLayout(null);
		panelSET.setBorder(new LineBorder(Color.red, 10));
		
		JButton AddCard = new JButton("HIT");
		AddCard.setBounds(40, 30, 120, 60);
		panelSET.add(AddCard);
		
		JButton NoAddCard = new JButton("STAND");
		NoAddCard.setBounds(40, 120, 120, 60);
		panelSET.add(NoAddCard);
		
		JPanel panelC = new JPanel();
		panelC.setBounds(150, 200, 300, 200);
		contentPane.add(panelC);
		panelC.setBorder(new LineBorder(Color.black, 1));
		panelC.setLayout(null);
//		MyDeck mydeck = new MyDeck();
		
		int card1[] = card.deal();
        
        JLabel picture1 = new JLabel(list.get(card1[0]));
        JLabel picture2 = new JLabel(list.get(card1[1]));
        JLabel picture3 = new JLabel(list.get(card1[2]));
        JLabel picture4 = new JLabel(list.get(card1[3]));
        JLabel picture5 = new JLabel(list.get(card1[4]));
        JLabel picture6 = new JLabel(list.get(card1[5]));
        JLabel picture7 = new JLabel(list.get(card1[6]));
        JLabel picture8 = new JLabel(list.get(card1[7]));
        JLabel picture9 = new JLabel(list.get(card1[8]));
        JLabel picture10 = new JLabel(list.get(card1[9]));
        JLabel picture11 = new JLabel(list.get(card1[10]));
        JLabel picture12 = new JLabel(list.get(card1[11]));
        JLabel picture13 = new JLabel(list.get(card1[12]));
        JLabel picture14 = new JLabel(list.get(card1[13]));
        JLabel picture15 = new JLabel(list.get(card1[14]));
        JLabel picture16 = new JLabel(list.get(card1[15]));
        JLabel picture17 = new JLabel(list.get(card1[16]));
        JLabel picture18 = new JLabel(list.get(card1[17]));
        JLabel picture19 = new JLabel(list.get(card1[18]));
        JLabel picture20 = new JLabel(list.get(card1[19]));
        JLabel picture21 = new JLabel(list.get(card1[20]));
        JLabel picture22 = new JLabel(list.get(card1[21]));
        JLabel picture23 = new JLabel(list.get(card1[22]));
        JLabel picture24 = new JLabel(list.get(card1[23]));
        JLabel picture25 = new JLabel(list.get(card1[24]));
        JLabel picture26 = new JLabel(list.get(card1[25]));
        JLabel picture27 = new JLabel(list.get(card1[26]));
        JLabel picture28 = new JLabel(list.get(card1[27]));
        JLabel picture29 = new JLabel(list.get(card1[28]));
        JLabel picture30 = new JLabel(list.get(card1[29]));
        JLabel picture31 = new JLabel(list.get(card1[30]));
        JLabel picture32 = new JLabel(list.get(card1[31]));
        JLabel picture33 = new JLabel(list.get(card1[32]));
        JLabel picture34 = new JLabel(list.get(card1[33]));
        JLabel picture35 = new JLabel(list.get(card1[34]));
        JLabel picture36 = new JLabel(list.get(card1[35]));
        JLabel picture37 = new JLabel(list.get(card1[36]));
        JLabel picture38 = new JLabel(list.get(card1[37]));
        JLabel picture39 = new JLabel(list.get(card1[38]));
        JLabel picture40 = new JLabel(list.get(card1[39]));
        JLabel picture41 = new JLabel(list.get(card1[40]));
        JLabel picture42 = new JLabel(list.get(card1[41]));
        JLabel picture43 = new JLabel(list.get(card1[42]));
        JLabel picture44 = new JLabel(list.get(card1[43]));
        JLabel picture45 = new JLabel(list.get(card1[44]));
        JLabel picture46 = new JLabel(list.get(card1[45]));
        JLabel picture47 = new JLabel(list.get(card1[46]));
        JLabel picture48 = new JLabel(list.get(card1[47]));
        JLabel picture49 = new JLabel(list.get(card1[48]));
        JLabel picture50 = new JLabel(list.get(card1[49]));
        JLabel picture51 = new JLabel(list.get(card1[50]));
        JLabel picture52 = new JLabel(list.get(card1[51]));
		
        panelC.add(picture1);
		picture1.setBounds(100,10,80,120);
		panelC.add(picture2);
		picture2.setBounds(99,11,80,120);
		panelC.add(picture3);
		picture3.setBounds(98,12,80,120);
		panelC.add(picture4);
		picture4.setBounds(97,13,80,120);
		panelC.add(picture5);
		picture5.setBounds(96,14,80,120);
		panelC.add(picture6);
		picture6.setBounds(95,15,80,120);
		panelC.add(picture7);
		picture7.setBounds(94,16,80,120);
		panelC.add(picture8);
		picture8.setBounds(93,17,80,120);
		panelC.add(picture9);
		picture9.setBounds(92,18,80,120);
		panelC.add(picture10);
		picture10.setBounds(91,19,80,120);
		panelC.add(picture11);
		picture11.setBounds(90,20,80,120);
		panelC.add(picture12);
		picture12.setBounds(89,21,80,120);
		panelC.add(picture13);
		picture13.setBounds(88,22,80,120);
		panelC.add(picture14);
		picture14.setBounds(87,23,80,120);
		panelC.add(picture15);
		picture15.setBounds(86,24,80,120);
		panelC.add(picture16);
		picture16.setBounds(85,25,80,120);
		panelC.add(picture17);
		picture17.setBounds(84,26,80,120);
		panelC.add(picture18);
		picture18.setBounds(83,27,80,120);
		panelC.add(picture19);
		picture19.setBounds(82,28,80,120);
		panelC.add(picture20);
		picture20.setBounds(81,29,80,120);
		panelC.add(picture21);
		picture21.setBounds(80,30,80,120);
		panelC.add(picture22);
		picture22.setBounds(79,31,80,120);
		panelC.add(picture23);
		picture23.setBounds(78,32,80,120);
		panelC.add(picture24);
		picture24.setBounds(77,33,80,120);
		panelC.add(picture25);
		picture25.setBounds(76,34,80,120);
		panelC.add(picture26);
		picture26.setBounds(75,35,80,120);
		panelC.add(picture27);
		picture27.setBounds(74,36,80,120);
		panelC.add(picture28);
		picture28.setBounds(73,37,80,120);
		panelC.add(picture29);
		picture29.setBounds(72,38,80,120);
		panelC.add(picture30);
		picture30.setBounds(71,39,80,120);
		panelC.add(picture31);
		picture31.setBounds(70,40,80,120);
		panelC.add(picture32);
		picture32.setBounds(69,41,80,120);
		panelC.add(picture33);
		picture33.setBounds(68,42,80,120);
		panelC.add(picture34);
		picture34.setBounds(67,43,80,120);
		panelC.add(picture35);
		picture35.setBounds(66,44,80,120);
		panelC.add(picture36);
		picture36.setBounds(65,45,80,120);
		panelC.add(picture37);
		picture37.setBounds(64,46,80,120);
		panelC.add(picture38);
		picture38.setBounds(63,47,80,120);
		panelC.add(picture39);
		picture39.setBounds(62,48,80,120);
		panelC.add(picture40);
		picture40.setBounds(61,49,80,120);
		panelC.add(picture41);
		picture41.setBounds(60,50,80,120);
		panelC.add(picture42);
		picture42.setBounds(59,51,80,120);
		panelC.add(picture43);
		picture43.setBounds(58,52,80,120);
		panelC.add(picture44);
		picture44.setBounds(57,53,80,120);
		panelC.add(picture45);
		picture45.setBounds(56,54,80,120);
		panelC.add(picture46);
		picture46.setBounds(55,55,80,120);
		panelC.add(picture47);
		picture47.setBounds(54,56,80,120);
		panelC.add(picture48);
		picture48.setBounds(53,57,80,120);
		panelC.add(picture49);
		picture49.setBounds(52,58,80,120);
		panelC.add(picture50);
		picture50.setBounds(51,59,80,120);
		panelC.add(picture51);
		picture51.setBounds(50,60,80,120);
		panelC.add(picture52);
		picture52.setBounds(49,61,80,120);
		
		
		JLabel lblTable = new JLabel("Table");
		lblTable.setBounds(6, 6, 61, 16);
		panelC.add(lblTable);
	
	
		
	
	
	
	
	}
}


class DeckOfCards {
	
	
	int[] deal(){
		
		final int dealNUM = 52;
		
	    int[] NUM = new int[dealNUM];
        int[] deck = new int[52];
    	String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    	String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
      		"10", "Jack", "Queen", "King"};
        
    	// Initialize cards
    	for (int i = 0; i < deck.length; i++)
      		deck[i] = i;
    
    	// Shuffle the cards
    	for (int i = 0; i < deck.length; i++) {
    	
      		// Generate an index randomly
      		int index = (int)(Math.random() * deck.length);
      		int temp = deck[i];
      		deck[i] = deck[index]; 
      		deck[index] = temp;
    	}

    	// Display the first dealNUM cards
    	for (int i = 0; i < dealNUM; i++) {
      		String suit = suits[deck[i] / 13];
      		String rank = ranks[deck[i] % 13];
      		System.out.println("Card number " + deck[i] + ": " 
        		+ rank + " of " + suit);
        	NUM[i] = deck[i];	
    	}
    	return NUM;
  		
  	}
  

}
	



