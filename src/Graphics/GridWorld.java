package Graphics;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
public static void main(String[] args) {
	

World mehworld = new World();
mehworld.show();
Location loc1 = new Location(4,4);
Location loc2 = new Location(4,3);
Location loc3 = new Location(4,5);
Bug beetle = new Bug(Color.BLUE);
Flower rose = new Flower(Color.MAGENTA);
Flower rose2 = new Flower(Color.GREEN);
mehworld.add(loc1, beetle);
mehworld.add(loc2,rose2 );
mehworld.add(loc3,rose );
	
	
	


}
}	


