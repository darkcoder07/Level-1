package LeagueInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject{
int x;
int y;
int width;
int height;
int speed;

public Alien(int x, int y, int height, int width) {
	this.x=x;
	this.y=y;
	this.width=width;
	this.height=height;
	speed=3;
}
void update() {
 y=y+speed;	
}
void draw(Graphics g) {
	g.setColor(Color.YELLOW);
	g.fillRect(x, y, width, height);
	
	
}
}
