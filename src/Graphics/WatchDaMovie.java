package Graphics;

import javax.swing.JOptionPane;

public class WatchDaMovie {
	int ticketprice;
public static void main(String[] args) {
Movie matrix = new Movie ("The Matrix",6);
Movie seaofmonsters = new Movie ("The Sea of Monsters",4);
Movie frozen = new Movie ("Frozen",-10000);
Movie twilight = new Movie ("Twilight",0);
Movie forceawakens = new Movie ("The Force Awakens",5);
Movie legomovie = new Movie ("The Lego Movie", 3);

 String matrixprice = matrix.getTicketPrice();
 JOptionPane.showMessageDialog(null, matrixprice);
 String seaofmonstersprice = seaofmonsters.getTicketPrice();
 JOptionPane.showMessageDialog(null, seaofmonstersprice);
 String frozenprice = frozen.getTicketPrice();
 JOptionPane.showMessageDialog(null, frozenprice);
 String twilightprice = twilight.getTicketPrice();
 JOptionPane.showMessageDialog(null, twilightprice);
 String forceawakensprice = forceawakens.getTicketPrice();
 JOptionPane.showMessageDialog(null, forceawakensprice);
 String legomovieprice = matrix.getTicketPrice();
 JOptionPane.showMessageDialog(null, legomovieprice);

 
NetflixQueue queue = new NetflixQueue (); 
queue.addMovie(legomovie);
queue.addMovie(forceawakens);
queue.addMovie(twilight);
queue.addMovie(frozen);
queue.addMovie(matrix);
queue.addMovie(seaofmonsters);

queue.printMovies();
 Movie bestmovie = queue.getBestMovie();
 JOptionPane.showMessageDialog(null, "The best movie is...." + bestmovie);
Movie secondbestmovie = queue.getMovie(1);
JOptionPane.showMessageDialog(null, "The second best movie is..." + secondbestmovie);
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

