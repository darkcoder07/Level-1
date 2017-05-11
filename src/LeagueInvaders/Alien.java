package LeagueInvaders;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Alien extends GameObject {

int speed;


public Alien(int x, int y, int height, int width,ObjectManager om) {
	super(x, y, width, height);
	
	speed=3 + om.getScore()/100;
}
void update() {
	super.update();
	 int r = new Random().nextInt(3)-1;	
 y=y+speed;

 x=x+r;

 
 
}
void draw(Graphics g) {
	g.drawImage(GamePanel.alienImg, x, y, width, height, null);
	
	
}
}
