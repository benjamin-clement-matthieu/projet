import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class PMenu extends JPanel {
	final String TITRE = "PUISSANCE X";
	
	public PMenu(){
		
		
	}
	
	public void paintComponent(Graphics g){
		Font font = new Font("Courier", Font.BOLD, 20);
		g.setFont(font);
		g.setColor(Color.red);
		
		Graphics2D g2d = (Graphics2D) g;
	    FontMetrics fm = g2d.getFontMetrics();
	    Rectangle2D r = fm.getStringBounds(TITRE, g2d);
	    int x = (this.getWidth() - (int) r.getWidth()) / 2;
	    
	    g.drawString(TITRE, x, 50);
	} 
}
