package Graphics;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.gui.GridPanel;
import info.gridworld.world.World;

public class GridWorldV2 {
public static void main(String[] args) {
	
GridWorldV2 g = new GridWorldV2();
//g.SmileyFace();
g.Checkers();	
	
	

	
	
	
	
	
}

 void Checkers() {
	BoundedGrid grid = new BoundedGrid(4,4);
	
	World w = new World();
	w.setGrid(grid);
	w.show();
for (int y=0; y<4; y++) {	
for (int i = 0; i<4; i++)	{
	Location l = new Location(i,y);
	Bug b = new Bug();
	w.add(l, b);
	}}


	
}
 void SmileyFace() {	
Location l = new Location(3,3);	
Bug b = new Bug(Color.RED);
Location l2 = new Location(5,3);
Bug b2 = new Bug();

Bug b3 = new Bug();
Bug b4 = new Bug();
Bug b5 = new Bug();
Location l3 = new Location(7,4);
Location l4 = new Location(6,5);
Location l5 = new Location(5,5);
Location l6 = new Location(4,5);
Location l7 = new Location(3,5);
Location l8 = new Location(2,5);
Location l9 = new Location(1,4);
Bug b9 = new Bug();Bug b6 = new Bug();Bug b7 = new Bug();Bug b8 = new Bug();
Flower f = new Flower();
Flower f2 = new Flower();
Flower f0 = new Flower();

World world = new World();
world.show();
world.add(l, b);	
world.add(l2, b2);
world.add(l3, b3);
world.add(l4, b4);	
world.add(l5, f0);
world.add(l6, f);
world.add(l7, f2);
world.add(l8, b8);
world.add(l9, b9);
	
}
		
	
	
	

	
	
	
	
	
	
	
	
	
}
