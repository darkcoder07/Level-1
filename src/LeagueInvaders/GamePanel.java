package LeagueInvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer t;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;
	Font endFontOne;
	Font endFontTwo;
	RocketShip r = new RocketShip(250, 700, 50, 50);
	ObjectManager om = new ObjectManager();
	public static BufferedImage alienImg;
	public static BufferedImage rocketImg;
	public static BufferedImage bulletImg;

	void updateMenuState() {

	}

	void updateGameState() {
		om.checkCollision();
		om.update();
		om.manageEnemies();
		if(r.isAlive==false) {
			currentState=END_STATE;
			om.reset();
			r=new RocketShip(250,700,50,50);
			om.addObject(r);
		}
		

	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, LeagueInvadersI.width, LeagueInvadersI.height);
		g.setFont(titleFont);
		g.setColor(Color.ORANGE);
		g.drawString("-LEAGUE INVADERS-", 1, 100);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvadersI.width, LeagueInvadersI.height);
		om.draw(g);
		;
	}

	void drawEndState(Graphics g) {
		ObjectManager om = new ObjectManager();
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvadersI.width, LeagueInvadersI.height);
		g.setFont(endFontOne);
		g.setColor(Color.DARK_GRAY);
		g.drawString("Game Over", 100, 100);
		g.setFont(endFontTwo);
		g.setColor(Color.DARK_GRAY);
		g.drawString("Better luck next time? Score:" + om.getScore(), 100, 200);

	}

	public GamePanel() {

		t = new Timer(1000 / 60, this);
		startGame();
		titleFont = new Font("Arial", Font.BOLD, 48);
		endFontOne = new Font("Arial", Font.BOLD, 48);
		endFontTwo = new Font("Arial", Font.PLAIN, 20);
		om.addObject(r);
		try {
			alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));
			rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));
			bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet (1).png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	void startGame() {
		t.start();
	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState++;
			if (currentState > END_STATE) {
				currentState = MENU_STATE;
			}

		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			r.right = true;
		} else if (e.getKeyCode() == KeyEvent.VK_A) {
			r.left = true;
		} else if (e.getKeyCode() == KeyEvent.VK_SPACE) {

			om.addObject(new Projectile(r.x+23, r.y, 10, 10));
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_D) {
			r.right = false;
		} else if (e.getKeyCode() == KeyEvent.VK_A) {
			r.left = false;
		}
	}

}
