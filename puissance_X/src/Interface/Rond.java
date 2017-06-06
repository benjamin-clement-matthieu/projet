package Interface;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import Moteur.Case;

public class Rond extends JPanel {
	private Color currentColor = Color.WHITE;
	private int dimension;
	
	public Rond(int dim)
	{
		dimension = dim;
	}
	
	public void paintComponent(Graphics g) {
		
	    g.setColor(currentColor);
		g.fillOval(2, 2, dimension, dimension);
	}
	
	public void setColor(Case color)
	{
		switch(color)
		{
			case ROUGE:
				currentColor = Color.RED;
				break;
			case JAUNE:
				currentColor = Color.YELLOW;
				break;
		}
		this.repaint();
	}
}
