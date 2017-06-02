import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FPrincipale extends JFrame implements ActionListener {
	Rond[][] grille;
	private JLabel label = new JLabel("Le JLabel");

	public FPrincipale() {
		this.setTitle("Puissance 4");
		this.setSize(700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		grille = new Rond[7][7];
		InitGrille();
		this.setLayout(new GridLayout(7, 7));
		for (int i = 0; i < 7; i++)
			for (int j = 0; j < 7; j++)
				if (i < 6)
					this.getContentPane().add(grille[i][j]);
				else {
					String name = "col"+(j+1);
					JButton b = new JButton(name);
					b.setName(name);
					b.addActionListener(this);
					this.getContentPane().add(b);

				}

		this.setVisible(true);
	}

	private void InitGrille() {
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 7; j++)

			{
				grille[i][j] = new Rond();
			}

	}

	public void actionPerformed(ActionEvent arg0) {
		JButton b = (JButton) arg0.getSource();
		String bName = b.getName();
		if(bName.equals("col1"))
			grille[5][0].setColor(Color.red);
		if(bName.equals("col2"))
			grille[5][1].setColor(Color.YELLOW);
		if(bName.equals("col3"))
			grille[5][2].setColor(Color.red);
		if(bName.equals("col4"))
			grille[5][3].setColor(Color.YELLOW);
		if(bName.equals("col5"))
			grille[5][4].setColor(Color.red);
		if(bName.equals("col6"))
			grille[5][5].setColor(Color.YELLOW);
		if(bName.equals("col7"))
			grille[5][6].setColor(Color.red);
	}
}
