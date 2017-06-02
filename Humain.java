
public class Humain implements Joueur {
	private String nom;
	private Case couleur;
	
	public Humain(String nom, Case couleur){
		this.nom = nom;
		this.couleur = couleur;
	}
	
	@Override
	public void jouer(Jeu jeu) {
		
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
