package LeagueInvaders;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class LeagueInvadersI  {
	JFrame frame = new JFrame();
	public static final int width = 500;
	public static final int height = 800;
	GamePanel gp;

	public LeagueInvadersI() {
		gp  = new GamePanel();
		setup();
	}

	public static void main(String[] args) {
		LeagueInvadersI li = new LeagueInvadersI();

	}

	void setup() {

		frame.setVisible(true);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gp);
		frame.addKeyListener(gp);
	}


}
