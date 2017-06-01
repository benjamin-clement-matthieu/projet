import java.util.Random;

public class IARandom extends Ordinateur {
	
	public IARandom(Case couleur)
	{
		super(couleur);
	}
	
	@Override
	public void jouer(Jeu jeu) {
		int random = new Random().nextInt(jeu.getTHorizontale());
		
		while(!jeu.jouerCoup(random, this)){
			random = new Random().nextInt(jeu.getTHorizontale());
		}
	}
	
	
}
