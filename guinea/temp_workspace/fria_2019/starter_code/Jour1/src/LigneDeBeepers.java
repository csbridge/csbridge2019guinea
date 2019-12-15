/*
 * Programme: LigneDeBeepers
 * ----------
 * Placer des beepers sur toute la premiere ligne du monde de Karel.
 * Suppose que Karel commence dans le coin inférieur gauche et fait face a l'Est.
 */
import stanford.karel.SuperKarel;

public class LigneDeBeepers extends SuperKarel {
	
	public void run() {
		while(frontIsClear()) {
			putBeeper();
			move();
		}
		
		// La ligne de code suivante est nécessaire pour placer le beeper final.
		// A chaque iteration, Karel place un beeper dans la cellule courante 
		// et se déplace pour la cellule suivante.
		// Cette ligne de code place un beeper dans la derniere
		// cellule dans laquelle Karel s'est positioné.
		putBeeper();
	}

}
