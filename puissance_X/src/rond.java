import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Color;

public class rond extends JPanel {
	private Color currentColor = Color.WHITE;
	
	public void paintComponent(Graphics g) {
		try {
			Image img = ImageIO.read(new File("fond-bleu.jpg"));
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	    g.setColor(currentColor);
		g.fillOval(3, 3, 90, 90);
	}
	
	public void setColor(Color color)
	{
		currentColor = color;
		
		this.repaint();
	}
}
