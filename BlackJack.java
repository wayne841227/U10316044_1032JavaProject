

import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;



public class BlackJack extends JFrame {

	private JPanel contentPane;
	private JPanel panelSET = new JPanel();
	private JPanel panelC = new JPanel();
	private JLabel lblTable = new JLabel("Table");
	private JLabel lblplayer1 = new JLabel("player1");
	private JLabel lblplayer2 = new JLabel("player2");
	//private JLabel lblEND;
	private JButton AddCard = new JButton("HIT");
	private JButton NoAddCard = new JButton("STAND");
	private JButton btnReady = new JButton("READY");
	
	private JPanel panelLineN = new JPanel();
	private JPanel panelLineS = new JPanel();
	
	private int points;

	final int FINAL_CARDS_NUMBER = 52;

    ImageIcon[] CARDS  = new ImageIcon [FINAL_CARDS_NUMBER];
        
    ArrayList<JLabel> list = new ArrayList<JLabel>();
    
    int[][] player = new int[4][5];
    
    int [] card1;
    JLabel picture[] = new JLabel[FINAL_CARDS_NUMBER];
    

	DeckOfCards card = new DeckOfCards();
	Ready ready = new Ready();
//	Show show = new Show();
	
	int Count1 = 0;
	int Count0 =0;
	int CardOrder = 4;
	int MyOrder = 2;
	int OneOrder = 2;
	boolean dead0 = false ;
	boolean dead1 = false ;
	

	BlackJack() {
		
		for(int i=0; i<4;i++){
			for(int j =0;j<5;j++){
				player[i][j] = -1;
			}
		}
		
				
		
		

		for(int i = 0; i <FINAL_CARDS_NUMBER; i++){
            CARDS[i] = new ImageIcon("/Users/wayne/Documents/workspace/blackjack104/picture/card/" + (i + 1) + ".png");    
			picture[i] = new JLabel(CARDS[i]);
			//list.add(picture[i]);
        }
		
		card1 = card.deal(FINAL_CARDS_NUMBER);
		
		for(int i = 0; i <FINAL_CARDS_NUMBER; i++){
			panelC.add(picture[card1[i]]);
			picture[card1[i]].setBounds(300-i,200+i,78,100);
		}
		System.out.println("HEY!!"+card1[2]);
		

		
//		JLabel [] c = getCards(picture);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		panelSET.setBounds(600, 0, 200, 600);
		contentPane.add(panelSET);
		panelSET.setLayout(null);
		panelSET.setBorder(new LineBorder(Color.red, 10));
		
//		panelSET.add(lblEND);
//		lblEND.setBounds(43, 200, 60, 15);
		
		AddCard.setBounds(40, 30, 120, 60);
		panelSET.add(AddCard);
		
		NoAddCard.setBounds(40, 120, 120, 60);
		panelSET.add(NoAddCard);
		
		btnReady.setBounds(43, 413, 117, 29);
		panelSET.add(btnReady);
		
		panelC.setBounds(0, 0, 600, 600);
		contentPane.add(panelC);
		panelC.setBorder(new LineBorder(Color.black, 1));
		panelC.setLayout(null);
		

		
		panelLineN.setBounds(0,170,600,4);
		panelC.add(panelLineN);
		panelLineN.setBorder(new LineBorder(Color.blue, 2));
		panelLineS.setBounds(0,430,600,4);
		panelC.add(panelLineS);
		panelLineS.setBorder(new LineBorder(Color.blue, 2));
		
		lblTable.setBounds(116, 186, 60, 15);
		panelC.add(lblTable);
		
		lblplayer1.setBounds(116, 446, 60, 15);
		panelC.add(lblplayer1);
		
		lblplayer2.setBounds(428, 143, 60, 15);
		panelC.add(lblplayer2);

		
		this.setVisible(true);
				
		btnReady.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ready.deal01(picture,card1);
				ready.deal02(picture,card1);
		
				for(int i=0;i<4;i++){
					
					ready.addCARD(card1,i%2,i<2?0:1,i,player);

				}
			
			}
		});
				
		AddCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ready.addCARD(card1,0,MyOrder,CardOrder, player);
				
				
				System.out.println("HHH"+player[0][MyOrder]);
				
				ready.show0(picture,card1,CardOrder,MyOrder);
				
				int Count0 = 0;
					for(int i=0;i<5;i++){
						
						Count0 += getPoints(player,0,i);
						System.out.println("lll"+Count0);
					}
					
					if(Count0>21){
						System.out.println("爆了" + Count0);
						dead0 = true;
//						stack =1;
					}
				MyOrder++;
				CardOrder++;
				System.out.println("aaa~~ "+Count0);
			}
		});
		
		NoAddCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				for(int i=0;i<5;i++){
//					
//					Count0 += getPoints(player,0,i);
//					System.out.println("lll"+Count0);
//				}
//				System.out.println("aaa"+Count0);
				
				System.out.println(" fff " );
				
				Count1 += getPoints(player,1,0);
				System.out.println("llasdl"+Count1);
				Count1 += getPoints(player,1,1);
				System.out.println("llldfg"+Count1);
				
				judge();
				
				
			}
		});
		
	}
	
	void judge(){
		while(Count1<17){
			ready.add1(card1,OneOrder,CardOrder, player);
			ready.show1(picture,card1,CardOrder,OneOrder);
			
			System.out.println("HHHHH"+player[1][OneOrder]);
			Count1 += getPoints(player,1,OneOrder);
			
			
			System.out.println(" zxcvb "+getPoints(player,1,OneOrder));
			System.out.println(" ; "+OneOrder);
			
			if(Count1>21){
				System.out.println("11111爆了" + Count1);
				dead1 = true;
			}
			MyOrder++;
			CardOrder++;
			System.out.println("aaa~~ "+Count1);
		}	
		System.out.println("bbb~~ "+Count1);
		
		if(Count1>Count0 && dead1==false){
			System.out.println("player2 WIN");
//			 lblEND = new JLabel("player2 WIN");
		}
		else if(Count0>Count1 && dead0 ==false){
			System.out.println("player1 WIN");
//			lblEND = new JLabel("player1 WIN");
		}
		else if(dead1==false && dead1==false){
			System.out.println("Both  Lose");
//			lblEND = new JLabel("Both  Lose");
		}
	}	
	
	
	int getPoints(int player[][],int person,int card){
		
		points = ((player[person][card])%13)+1;
		
		if(points>10){
			points = 10;
		}
		
		return points;
	}
	
}


class DeckOfCards {
	
	DeckOfCards(){
		
	}
	
	int[] deal(int num){
		
		
	    int[] NUM = new int[num];
        int[] deck = new int[52];
    	String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    	String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
      		"10", "11", "12", "13"};
        
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
    	for (int i = 0; i < 52; i++) {
      		String suit = suits[deck[i] / 13];
      		String rank = ranks[deck[i] % 13];
      		System.out.println("Card number " + deck[i] + ": " 
        		+ rank + " of " + suit);
        	NUM[i] = deck[i];	
    	}
    	return NUM;
  		
  	}
  

}

class Ready{
	
	Ready(){
	}
	
	int people = 10;
	JLabel [] deal01(JLabel a[],int b[]){
		
		
		a[b[0]].setBounds(105,480,78,100);
		a[b[1]].setBounds(410,10,78,100);

		
		return a;
	}
	JLabel [] deal02(JLabel c[],int d[]){
		
		
		c[d[2]].setBounds(105+78,480,78,100);
		c[d[3]].setBounds(410-78,10,78,100);

		
		return c;
	}
	
	void addCARD(int e[],int person,int handcard,int number,int [][] player){
		
		player[person][handcard] = e[number];
		
	}
	JLabel [] show0 (JLabel a[],int b[],int c,int d){
		
		a[b[c]].setBounds(105+78*d,480,78,100);
			
		return a;
	}
	
	void add1(int e[],int handcard,int number,int [][] player){
		player[1][handcard] = e[number];
		
		
	}
	
	JLabel [] show1( JLabel c[] , int d[] ,int e,int f){
		
		c[d[e]].setBounds(410-78*f,10,78,100);
		
		return c;
	}
}
