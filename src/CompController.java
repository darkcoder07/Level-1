import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompController implements ActionListener {
	CompData cd;
	CompView cv;
	
	

public CompController(CompData cd,CompView cv)	{
	
this.cd=cd;
this.cv=cv;

cv.actionListeners(this);
cv.setup();

	
	
}


@Override
public void actionPerformed(ActionEvent e) {
	
	
}
	
	
	
	
	
	
	
}
