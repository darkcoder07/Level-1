package LeagueInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {

	int x;
	int y;
	int width;
	int height;
	int speed;

	public Projectile(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		speed = 10;

	}

	void update() {
       y=y-speed;
       if (y<0) {
    	   isAlive=false;
       }
	}

	void draw(Graphics g) {
      g.setColor(Color.red);
      g.fillRect(x, y, width, height);
	}

}
