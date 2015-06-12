import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Rule extends JFrame{
	
	private JPanel a;
	
	Rule(){
		setTitle("Rules");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 792, 537);
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
		txtrblackjack.setBounds(6, 6, 780, 500);
		a.add(txtrblackjack);
	}	
}
