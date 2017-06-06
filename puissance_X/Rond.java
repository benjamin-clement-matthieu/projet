package Interface;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Color;

public class Rond extends JPanel {
	private Color currentColor = Color.WHITE;
	
	public void paintComponent(Graphics g) {
		
	    g.setColor(currentColor);
		g.fillOval(3, 3, 65, 65);
	}
	
	public void setColor(Color color)
	{
		currentColor = color;
		
		this.repaint();
	}
}

