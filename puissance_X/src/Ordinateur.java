
public abstract class Ordinateur implements Joueur {
	private String nom;
	private Case couleur;
	
	public Ordinateur(Case couleur){
		this.nom = "Ordinateur";
		this.couleur = couleur;
	}
	
	@Override
	public void Jouer(Jeu jeu) {
		
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
