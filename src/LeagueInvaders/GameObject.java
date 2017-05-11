package LeagueInvaders;

import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
Rectangle collisionBox = new Rectangle();
int x;
int y;
int width;
int height;
boolean isAlive;
public GameObject(int x, int y, int width, int height) {
	this.x=x;
	this.y=y;
	this.width=width;
	this.height=height;
	isAlive = true;
  collisionBox.setBounds(x, y, width, height);
}

void update() {
	 collisionBox.setBounds(x, y, width, height);
}
void draw(Graphics g) {
	
}
	
	
}
