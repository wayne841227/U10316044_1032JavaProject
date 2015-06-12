
import javax.swing.JFrame;


public class BeginClass extends JFrame{
	private static BeginClass frame;
	private static GameStart gamestart;
	private static BlackJack blackjack;
	private static Rule rule;
	public BeginClass(){
		
	}
	
	public static void main(String[] args) {
		
		gamestart = new GameStart();
		
//		blackjack.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		blackjack.getContentPane().setLayout(null);
//		blackjack.setBounds(100, 100, 800, 625);
		
		gamestart.setVisible(true);
	}
	
	public static BeginClass getFrame(){
		return frame;
	}
	public static Rule getRule(){
		return rule;
	}
	
}

