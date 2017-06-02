package Interface;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ClickColEvent implements ActionListener {
	
	private int selectedCol = -1;
	private boolean clicked = false;
	
	public void actionPerformed(ActionEvent arg0) {
		JButton b = (JButton) arg0.getSource();
		String bName = b.getName();
		if(bName.equals("col1"))
			selectedCol = 0;
		else if(bName.equals("col2"))
			selectedCol = 1;
		else if(bName.equals("col3"))
			selectedCol = 2;
		else if(bName.equals("col4"))
			selectedCol = 3;
		else if(bName.equals("col5"))
			selectedCol = 4;
		else if(bName.equals("col6"))
			selectedCol = 5;
		else if(bName.equals("col7"))
			selectedCol = 6;
		
		clicked = true;
	}
	
	public boolean clicked()
	{
		return clicked;
	}
	
	public int getSelectedCol()
	{
		clicked = false;
		return selectedCol;
	}
}
