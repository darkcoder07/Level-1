package Graphics;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class HousesTwo {
public static void main(String[] args) {
	HC hc = new HC(true);
	hc.doStuff();	
	hc.moveToCorner();
	
	for (int i=0; i<100; i++) {
	hc.GrassyHouse("weird floating futuristic city of doom",67,12,190);
	}
}
	

}
