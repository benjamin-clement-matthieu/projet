package Moteur;

public class Humain implements Joueur {
	private String nom;
	private Case couleur;

	public Humain(String nom, Case couleur) {
		this.nom = nom;
		this.couleur = couleur;
	}

	@Override
	public void jouer(Jeu jeu) {
		try {

			int selectedCol;
			do {
				// On attend que le joueur click
				while (Interface.PGrille.click.clicked() == false) {
					Thread.sleep(100);
				}

				selectedCol = Interface.PGrille.click.getSelectedCol();

			} while (!jeu.jouerCoup(selectedCol, this));

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Case getCouleur() {
		return couleur;
	}

	@Override
	public String getNom() {
		return nom;
	}

}
