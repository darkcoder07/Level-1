package Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController implements ActionListener {
	Menu view;
	MenuData md;

	public MenuController(Menu view, MenuData data) {
      this.view = view;
      this.md = data;
      view.addListener(this);
      setup();
	}
	void setup() {
	  
	   view.setl (md.getItem1());
	   view.setl2 (md.getItem1());
	   view.setl3 (md.getItem1());
	   view.setl4 (md.getItem1());
	   view.setl5 (md.getItem1());
	  
	   
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		md.menuCheck(view.getTextField());
		view.output.setText("Order Taken! Have a great day.");
		
	}
	

}
